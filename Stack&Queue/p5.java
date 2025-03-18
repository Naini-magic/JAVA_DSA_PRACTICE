public class p5 {
    // Node class for DLL
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    // Stack class with DLL
    static class Stack {
        private Node head;
        private Node mid;
        private int size;

        public Stack() {
            head = mid = null;
            size = 0;
        }

        // Push operation
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
            size++;

            // Update mid pointer
            if (size == 1) {
                mid = head;
            } else if (size % 2 != 0) { // Move mid back when odd elements
                mid = mid.prev;
            }
        }

        // Pop operation
        public int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int popData = head.data;
            head = head.next;
            size--;

            // Update head's previous pointer
            if (head != null) {
                head.prev = null;
            }

            // Update mid pointer
            if (size % 2 == 0 && mid != null) {
                mid = mid.next; // Move mid forward when even elements
            }

            // If stack becomes empty, reset mid to null
            if (size == 0) {
                mid = null;
            }

            return popData;
        }

        // Find middle element
        public int findMiddle() {
            if (mid == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return mid.data;
        }

        // Delete middle element
        public void deleteMiddle() {
            if (mid == null) {
                System.out.println("Stack is empty");
                return;
            }

            if (mid.prev != null) {
                mid.prev.next = mid.next;
            }
            if (mid.next != null) {
                mid.next.prev = mid.prev;
            }

            // Update mid pointer
            if (size % 2 == 0) {
                mid = mid.next; // Move mid forward when even elements
            } else {
                mid = mid.prev; // Move mid backward when odd elements
            }

            size--;

            // If stack becomes empty, reset mid
            if (size == 0) {
                mid = null;
            }
        }
    }

    // Main function to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Middle element: " + stack.findMiddle()); // Output: 3

        stack.deleteMiddle();
        System.out.println("Middle element after deletion: " + stack.findMiddle()); // Output: 4

        System.out.println("Popped: " + stack.pop()); // Output: 5
        System.out.println("Middle element: " + stack.findMiddle()); // Output: 2
    }
}
