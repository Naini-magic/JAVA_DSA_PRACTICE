public class l1_Reverse{
    private Node head;
    private Node tail;

    class Node{
    private int value ;
    private Node next ;
    public Node(int value){
        this.value = value;
    }
    public Node(int value , Node next){
        this.value = value;
        this.next = next;
    }
    }
    
// iteratively
    public void reverse(){
        Node prev =  null;
        Node p = head;
        Node next ;

        while(p != null){
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
            
        }
        head = prev;
    }


    public Node reverseRec(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRec(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public void insertValue(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

        public void displayList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
    
            }
            System.out.println("null");
        }
    

    public static void main(String []args){
         l1_Reverse l = new l1_Reverse();
         l.insertValue(4);
         l.insertValue(5);
         l.insertValue(6);
         l.insertValue(7);
         l.insertValue(8);

        l.displayList();

        // l.reverse();

        // l.displayList();


        l.head = l.reverseRec(l.head);
        System.out.println("Reversed List (Recursive):");
        l.displayList();
    
}
}