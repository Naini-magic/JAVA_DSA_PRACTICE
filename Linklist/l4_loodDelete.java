
class Node {
    int data;
    Node next;
    Node(int d) { 
        data = d; 
        next = null; 
    }
}

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return; // No loop if the list is empty or has only one node
        }

        Node slow = head, fast = head;

        // Step 1: Detect the loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If no loop is found, return
        if (slow != fast) {
            return;
        }

        // Step 2: Find the starting node of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find the last node in the loop
        Node prev = fast;
        while (prev.next != fast) {
            prev = prev.next;
        }

        // Step 4: Remove the loop by setting last node's next to null
        prev.next = null;
    }
}
