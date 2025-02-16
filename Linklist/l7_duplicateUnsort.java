import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class l7_duplicateUnsort {
    // Function to remove duplicates from an unsorted linked list
    public Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> unique = new HashSet<>();
        Node start = head;
        unique.add(start.data); // Add the first node’s data

        while (start.next != null) {
            if (unique.contains(start.next.data)) {
                start.next = start.next.next; // Remove duplicate node
            } else {
                unique.add(start.next.data); // Add unique data
                start = start.next; // Move to next node
            }
        }

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
        // Creating linked list: 1 -> 2 -> 3 -> 2 -> 4 -> 3 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        l7_duplicateUnsort sol = new l7_duplicateUnsort();
        head = sol.removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
