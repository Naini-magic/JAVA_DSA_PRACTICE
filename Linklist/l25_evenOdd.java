class Solution {
    public Node divide(int N, Node head) {
        if (head == null || head.next == null) return head; // Edge case
        
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node curr = head;
        
        // Traverse and separate even and odd numbers
        while (curr != null) {
            if (curr.data % 2 == 0) { // Even number
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            } else { // Odd number
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }
        
        // If there are no even numbers, return the odd list as it is
        if (evenHead == null) return oddHead;
        
        // If there are no odd numbers, return the even list as it is
        if (oddHead == null) return evenHead;
        
        // Connect the even list to the odd list
        evenTail.next = oddHead;
        oddTail.next = null; // Set last node’s next as NULL to avoid cycles
        
        return evenHead;
    }
}
