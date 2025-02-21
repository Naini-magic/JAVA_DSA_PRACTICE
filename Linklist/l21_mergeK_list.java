import java.util.PriorityQueue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    // Function to merge K sorted linked lists
    static Node l21_mergeK_list(Node[] arr, int k) {
        // Priority Queue (Min Heap) to store nodes based on their data value
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add the head nodes of all linked lists to the heap
        for (int i = 0; i < k; i++) {
            if (arr[i] != null) {
                minHeap.add(arr[i]);
            }
        }

        // Dummy node to simplify linked list operations
        Node dummy = new Node(-1);
        Node tail = dummy;

        // Process the minHeap
        while (!minHeap.isEmpty()) {
            Node smallest = minHeap.poll(); // Extract the smallest node
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next); // Insert the next node of extracted element
            }
        }

        return dummy.next; // Return merged sorted list
    }

    // Utility function to print linked list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int k = 4; // Number of linked lists
        Node[] arr = new Node[k];

        // Linked List 1: 1 -> 2 -> 3
        arr[0] = new Node(1);
        arr[0].next = new Node(2);
        arr[0].next.next = new Node(3);

        // Linked List 2: 4 -> 5
        arr[1] = new Node(4);
        arr[1].next = new Node(5);

        // Linked List 3: 5 -> 6
        arr[2] = new Node(5);
        arr[2].next = new Node(6);

        // Linked List 4: 7 -> 8
        arr[3] = new Node(7);
        arr[3].next = new Node(8);

        System.out.println("Merged Sorted Linked List:");
        Node mergedHead = l21_mergeK_list(arr, k);
        printList(mergedHead);
    }
}
