class Solution {
    public Node rotateDLL(Node head, int p) {
        if (head == null || head.next == null || p == 0) {
            return head; // No rotation needed
        }

        Node last = head;
        int count = 1;

        // Find last node and count total nodes
        while (last.next != null) {
            last = last.next;
            count++;
        }

        // If p == count or p % count == 0, no rotation needed
        p = p % count;
        if (p == 0) return head;

        // Find the new head after rotating p nodes
        Node newHead = head;
        for (int i = 0; i < p; i++) {
            newHead = newHead.next;
        }

        // Define the new tail (node before new head)
        Node newTail = newHead.prev;
        
        // Disconnect the new tail
        newTail.next = null;
        newHead.prev = null;
        
        // Connect last node to old head
        last.next = head;
        head.prev = last;

        return newHead; // Return new rotated head
    }
}
