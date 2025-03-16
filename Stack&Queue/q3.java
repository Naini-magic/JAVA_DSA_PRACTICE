
public class q3 {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    static class Queue_linklist {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node n = new Node(data);
            if (isEmpty()) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Already empty");
                return -1;
            }
            int front = head.value;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        public static int peek() {
            if (head == null) {
                System.out.println("empty");
                return -1;
            }
            return head.value;
        }
    }

    public static void main(String[] args) {
        Queue_linklist Q = new Queue_linklist();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
