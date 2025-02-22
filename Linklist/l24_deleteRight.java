class Solution {
    // Function to reverse the linked list
    private Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node compute(Node head) {
        if (head == null || head.next == null) return head; // Edge case

        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Traverse and remove smaller nodes
        Node curr = head;
        int maxVal = curr.data;

        while (curr != null && curr.next != null) {
            if (curr.next.data < maxVal) {
                curr.next = curr.next.next; // Delete the node
            } else {
                curr = curr.next;
                maxVal = curr.data; // Update max value
            }
        }

        // Step 3: Reverse the list back to restore order
        return reverse(head);
    }
}
