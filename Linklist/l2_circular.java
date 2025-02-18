
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if(head == null) return false;
        Node temp = head.next;
        while(temp !=null && temp != head){
            temp = temp.next;
        }
        return temp == head;
    }


    
        boolean isCircular(Node head) {
        if(head == null) {return false;}
        if(head.next == head){return true;}
        Node slow = head;
        Node fast = head;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}