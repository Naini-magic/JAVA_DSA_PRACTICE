class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // Base case: if list is empty or only one main node
        if (root == null || root.next == null) {
            return root;
        }
        
        // Recursively flatten the next sublist
        root.next = flatten(root.next);
        
        // Merge the current list with the flattened next list
        root = merge(root, root.next);
        
        return root;
    }
    
    // Function to merge two sorted lists using the bottom pointer
    static Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;
        
        Node result;
        
        if (left.data < right.data) {
            result = left;
            result.bottom = merge(left.bottom, right); // Use bottom, not next
        } else {
            result = right;
            result.bottom = merge(left, right.bottom); // Use bottom, not next
        }
        
        return result;
    }
}
