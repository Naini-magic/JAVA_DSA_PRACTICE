/*Given a binary tree, find its height.

The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children. */


public class t3_height {
    public static int height(Node node) {
        // code here
        if(node == null){
            return -1;
        }
        
        int ls = height(node.left);
        int rs = height(node.right);
        
        return 1 + Math.max(ls , rs);
    }
     public static void main(String[] args) {
        // Manually constructing the tree: [12, 8, 18, 5, 11]
        /*
                  12
                 /  \
                8    18
               / \
              5  11
        */

        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        t3_height solution = new t3_height();
        int treeHeight = solution.height(root);
        System.out.println("Height of the tree (in edges): " + treeHeight);
    }
}