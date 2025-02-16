class l3Loop{
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        if (head == null || head.next == null) {
            return false; // No loop if list is empty or has only one node
        }

        Node slow = head;      // Moves one step at a time
        Node fast = head;      // Moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1 step
            fast = fast.next.next;    // Move fast by 2 steps

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop found
    }
}
