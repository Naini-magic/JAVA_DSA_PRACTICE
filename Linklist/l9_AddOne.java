/// recursion





// public Node addOne(Node head) {
//     // code here.
//    int carry = addOneUntil(head);
   
   
//    if(carry > 0){
//        Node newhead = new Node(carry);
//        newhead.next = head;
//        head = newhead;
//    }
   
//    return head;
// }

// private static int addOneUntil(Node head){
    
//     if(head == null) return 1;
    
//     int carry = addOneUntil(head.next);
    
//     int sum = head.data + carry;
//     head.data = sum % 10;
//     return sum/ 10;
// }



class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class l9_AddOne {
    // Function to add 1 to the linked list number
    public static Node addOne(Node head) {
        // Step 1: Reverse the linked list
        head = reverseList(head);

        // Step 2: Add 1 to the first node
        Node temp = head;
        int carry = 1;
        
        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10; // Update current node
            carry = sum / 10;     // Update carry

            if (carry == 0) break; // No need to continue if carry is 0
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry); // Add new node if carry remains
                break;
            }

            temp = temp.next;
        }

        // Step 3: Reverse the list back to original order
        head = reverseList(head);
        return head;
    }

    // Function to reverse the linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);

        System.out.print("Original List: ");
        printList(head);

        head = addOne(head);

        System.out.print("Updated List: ");
        printList(head);
    }
}
