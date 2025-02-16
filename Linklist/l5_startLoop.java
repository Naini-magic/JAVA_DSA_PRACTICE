// Node class definition
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class l5_startLoop {
    // Function to find the first node of the loop in the linked list
    public static int findFirstNode(Node head) {
        if (head == null || head.next == null) {
            return -1; // No loop if list is empty or has one node
        }

        Node slow = head, fast = head;

        // Step 1: Detect loop using Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If no loop is found, return -1
        if (slow != fast) {
            return -1;
        }

        // Step 2: Find the start of the loop
        slow = head; // Move slow pointer to the head
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // The node where they meet is the start of the loop
        return slow.data;
    }

    // Helper function to create a loop in the linked list
    public static void createLoop(Node head, int pos) {
        if (pos == 0) return;
        
        Node temp = head;
        Node loopStart = null;
        int count = 1;
        
        while (temp.next != null) {
            if (count == pos) {
                loopStart = temp;
            }
            temp = temp.next;
            count++;
        }
        
        temp.next = loopStart; // Creating the loop
    }

    // Driver code to test the function
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        // Creating a loop (Connecting last node to node at position 2)
        createLoop(head, 2);

        // Finding the first node of the loop
        System.out.println(findFirstNode(head)); // Expected Output: 3
    }
}
