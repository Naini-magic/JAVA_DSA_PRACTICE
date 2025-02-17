class Solution{
    public static Node intersection(Node head1 , Node head2){
      Node t1 = head1;
      Node t2 = head2;


      Node result = null;
      Node temp = null;

      while(t1 != null || t2 != null){
        if(t1.data < t2.data){
            t1 = t1.next;
        }else if(t1.data > t2.data){
            t2 = t2.next;
        }else{
       if(result == null){
         result = new Node(t1.data);
        temp = result;
        }else{
            temp.next = new Node(t1.data);
            temp = temp.next;
        }
        t1 = t1.next;
        t2 = t2.next;
        }
      }

      return result;
    }
}