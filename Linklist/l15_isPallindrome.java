

class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
         if(head == null || head.next == null){
            return true;
        }
        
        Node mid = middle(head);
        Node reverseHead = reverse(mid);
        Node head2 = reverseHead;
        Node head1 = head;
        while(head2 != null){
            if(head1.data != head2.data){
                return false;
            }
                head1 = head1.next;
                head2 = head2.next;
        }
        return true;
    }
    static Node middle(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    static Node reverse(Node head){
        if(head == null){
            return head;
        }
        
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
