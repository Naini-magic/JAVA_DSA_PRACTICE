// Definition for the singly linked list node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class l6_duplicate {
    // Function to remove duplicates from a sorted linked list
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head; // No duplicates if the list is empty or has only one node
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move forward if no duplicate
            }
        }

        return head;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Driver code to test the function
    public static void main(String[] args) {
        // Creating linked list: 2 -> 2 -> 4 -> 5
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
