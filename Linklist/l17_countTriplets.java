class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}



public class l17_countTriplets {
    public static int sum(Node head , int target){
        if (head == null) return 0;

        Node curr = head;
        // Node i = curr.next;
        Node j =  head;
        while(j.next != null){
          j = j.next;
        }
        Node last = j;

        int count = 0;

        while(curr != null){
            Node   i = curr.next;
            j = last;
            while (i != null && j != null &&  i != j && j.next != i ) {
            int sum = curr.data + i.data + j.data;
            if(sum == target){
             count++;
             i = i.next;
             j = j.prev;
            }else if(sum < target){
                    i = i.next;
            }else{
                    j = j.prev;
                }
            }
        
        curr = curr.next;
        
    }
    return count;
}
public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.prev = head;
    head.next.next = new Node(3);
    head.next.next.prev = head.next;
    head.next.next.next = new Node(4);
    head.next.next.next.prev = head.next.next;
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.prev = head.next.next.next;

    int target = 9;
    System.out.println("Number of triplets: " + sum(head, target));
}
}
