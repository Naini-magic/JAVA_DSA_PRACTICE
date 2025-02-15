/*Given the head a linked list, the task is to reverse every k node in the linked list. If the number of nodes is not a multiple of k then the left-out nodes in the end, should be considered as a group and must be reversed. */

class l1GroupReverse {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null) return null;

        // Step 1: Check if there are at least k nodes
        Node temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If less than k nodes, reverse normally
        if (count < k) return reverseList(head);

        // Step 2: Reverse first k nodes
        Node prev = null, current = head, next = null;
        for (int i = 0; i < k && current != null; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Recursively reverse the rest and connect
        head.next = reverseKGroup(current, k);

        // Step 4: Return the new head (prev)
        return prev;
    }

    // Function to reverse a given linked list
    public static Node reverseList(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Node class
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Utility function to insert nodes at the end
    public static Node insert(Node head, int value) {
        if (head == null) return new Node(value);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);
        return head;
    }

    // Utility function to print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 7);
        head = insert(head, 8);

        System.out.println("Original List:");
        printList(head);

        int k = 4;
        head = reverseKGroup(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        printList(head);
    }
}
