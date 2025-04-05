import java.util.Queue;
import java.util.Stack;

public class q6_reverce {
     public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Move elements back from stack to queue (reversing order)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }


    // recursion
    public static Queue<Integer> reverseQueue2(Queue<Integer> queue) {
        if (queue.isEmpty()) return queue; // Base case: return empty queue

        int front = queue.poll(); // Remove front element
        queue = reverseQueue(queue); // Recursive call on the remaining queue
        queue.add(front); // Add the removed element back

        return queue; // Return the modified queue
    }
    
    public static void main(String[] args) {
        
    }
}
