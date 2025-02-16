class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class l8_lastNodeToFirst {
    // Function to move the last element to the front of the linked list
    public Node moveToFront(Node head) {
        if (head == null || head.next == null) {
            return head; // No change needed for empty or single-node list
        }

        Node secondLast = null;
        Node last = head;

        // Traverse the list to find the last and second last node
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }

        // If only two nodes, directly swap them
        if (secondLast == null) return head;

        // Disconnect the last node
        secondLast.next = null;

        // Move last node to front
        last.next = head;
        head = last;

        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Original List:");
        printList(head);

        l8_lastNodeToFirst sol = new l8_lastNodeToFirst();
        head = sol.moveToFront(head);

        System.out.println("Modified List:");
        printList(head);
    }
}
