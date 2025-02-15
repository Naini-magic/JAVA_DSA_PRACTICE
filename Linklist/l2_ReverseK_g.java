/*Reverse Nodes in K-Group | Linked List (LeetCode 25)
Given a linked list, reverse the nodes in groups of k and return the modified list. If the number of nodes is not a multiple of k, then the left-out nodes in the end should remain as they are. 

ex:-
head = 1 -> 2 -> 3 -> 4 -> 5
k = 3

output:-
3 -> 2 -> 1 -> 4 -> 5
Explanation:
The first 3 nodes (1, 2, 3) are reversed.
The remaining nodes (4, 5) are not reversed because they are less than k.
*/

class l2_ReverseK_g {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        // Step 1: Check if there are at least k nodes in the list
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If less than k nodes remain, return head as is
        if (count < k) return head;

        // Step 2: Reverse the first k nodes
        ListNode prev = null, curr = head, next = null;
        for (int i = 0; i < k && curr != null; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Recursively process the remaining list
        head.next = reverseKGroup(curr, k);

        // Step 4: Return the new head (prev)
        return prev;
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        int k = 3;
        head = reverseKGroup(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        printList(head);
    }
}


