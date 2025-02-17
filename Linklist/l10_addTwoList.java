class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node n1 = reverse(num1);
        Node n2 = reverse(num2);



        Node curr = null;
        int carry = 0;

        while(n1 != null || n2 != null || carry > 0){
            int v1 = n1 != null ? n1.data : 0 ;
            int v2 = n2 != null ? n2.data : 0;
            int sum = v1 + v2 + carry;
            carry = sum/10;
            Node temp = new Node(sum % 10);
            temp.next = curr;
            curr = temp;
            if(n1 != null){
                n1 = n1.next;
            }
            if(n2 != null){
                n2 = n2.next;
            }
            
        }
        while(curr != null && curr.data == 0){
            curr = curr.next;
        }
            return curr;
            
        }
        

        static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}