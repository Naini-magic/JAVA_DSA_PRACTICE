class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class l20_sort_1_2_0 {
    // Function to sort a linked list of 0s, 1s, and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        // Dummy nodes for 0s, 1s, and 2s
        Node zeroH = new Node(-1), oneH = new Node(-1), twoH = new Node(-1);
        Node zero = zeroH, one = oneH, two = twoH;
        Node curr = head;

        // Traverse the list and distribute nodes
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Connect the segregated lists
        zero.next = (oneH.next != null) ? oneH.next : twoH.next;
        one.next = twoH.next;
        two.next = null; // End of list

        return zeroH.next; // New head of the sorted list
    }

    // Utility function to print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Test case: 1 -> 2 -> 2 -> 1 -> 2 -> 0 -> 2 -> 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(2);

        System.out.println("Original List:");
        printList(head);

        head = segregate(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}
