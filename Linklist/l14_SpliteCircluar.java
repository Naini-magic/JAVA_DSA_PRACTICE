

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        if (head == null || head.next == null) return new Pair<>(head, null);
        Node slow = head;
        Node fast = head;
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next.next == head) {
            fast = fast.next;
        }
        

        Node head2 = slow.next;
        fast.next = head2;
        slow.next = head;
        
        return new Pair<>(head, head2);
    }
}