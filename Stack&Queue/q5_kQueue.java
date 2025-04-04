import java.util.*;
public class q5_kQueue {

    int[] arr, front, rear, next;
    int n, k;
    int free; // Pointer to the first free slot

    // Constructor
    public q5_kQueue(int k, int n) {
        this.k = k;
        this.n = n;
        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        next = new int[n];

        // Initialize all queues as empty
        Arrays.fill(front, -1);
        Arrays.fill(rear, -1);

        // Initialize free list
        free = 0;
        for (int i = 0; i < n - 1; i++)
            next[i] = i + 1;
        next[n - 1] = -1; // Last index points to -1 (end of free list)
    }

    // Check if array is full
    public boolean isFull() {
        return free == -1;
    }

    // Check if a queue is empty
    public boolean isEmpty(int qn) {
        return front[qn] == -1;
    }

    // Enqueue an element in queue number 'qn'
    public void enqueue(int item, int qn) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        int i = free; // Get the first free index
        free = next[i]; // Update free to next available slot

        if (isEmpty(qn))
            front[qn] = i;
        else
            next[rear[qn]] = i; // Link new element to previous rear

        next[i] = -1; // Update next of new rear
        rear[qn] = i; // Update rear
        arr[i] = item; // Store the element
    }

    // Dequeue an element from queue number 'qn'
    public int dequeue(int qn) {
        if (isEmpty(qn)) {
            System.out.println("Queue Underflow");
            return Integer.MIN_VALUE;
        }

        int i = front[qn]; // Get front index
        front[qn] = next[i]; // Update front to next of current front

        if (front[qn] == -1)
            rear[qn] = -1; // If queue becomes empty, reset rear

        next[i] = free; // Add this index to free list
        free = i;

        return arr[i];
    }

    // Driver Code
    public static void main(String[] args) {
        int k = 3, n = 10;
        q5_kQueue kq = new q5_kQueue(k, n);

        kq.enqueue(15, 2);
        kq.enqueue(45, 2);
        kq.enqueue(17, 1);
        kq.enqueue(49, 1);
        kq.enqueue(39, 1);

        System.out.println("Dequeued from queue 2: " + kq.dequeue(2));
        System.out.println("Dequeued from queue 1: " + kq.dequeue(1));
    }
}

