class Solution {

    // Function to find the data of kth node from the end of a linked list.
    int getKthFromLast(Node head, int k) {
        if (head == null) return -1;  // Edge case: Empty list

        Node temp = head;
        int count = 0;
        
        // Count total nodes in the linked list
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // If k is greater than total nodes, return -1
        if (k > count) {
            return -1;
        }
        
        // Find the (count - k)th node from the start (0-based index)
        int target = count - k;
        Node curr = head;
        
        // Move to the target node
        for (int i = 0; i < target; i++) {
            curr = curr.next;
        }
        
        return curr.data;
    }
}



class Solution {
    int getKthFromLast(Node head, int k) {
        Node first = head;
        Node second = head;

        // Move 'first' k steps ahead
        for (int i = 0; i < k; i++) {
            if (first == null) return -1; // If k > length, return -1
            first = first.next;
        }

        // Move both pointers until 'first' reaches null
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data; // 'second' now points to the kth node from the end
    }
}




