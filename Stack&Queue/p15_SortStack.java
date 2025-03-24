import java.util.Arrays;
import java.util.Stack;

public class p15_SortStack {



    //Array-Based Sorting	O(N log N)	O(N) (Array Storage)	Faster sorting due to Arrays.sort()	Uses additional array
    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.

        // Convert stack to array
        Integer[] arr = s.toArray(new Integer[0]);
        while (!s.isEmpty()) {
            s.pop();
        } 
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        return s;

    }



    // Two-Stack Sorting	O(N²)	O(N) (Extra Stack)	Simple iterative approach	Slower sorting than array
    public static void sort_TWO(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int curr = stack.pop();

            // Move elements from tempStack to stack to maintain order
            while (!tempStack.isEmpty() && tempStack.peek() > curr) {
                stack.push(tempStack.pop());
            }
            tempStack.push(curr);
        }

        // Copy elements back to original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }


    // Recursive Sorting	tc:-O(N²)	SC:-O(N) (Recursion Stack)	No extra data structures	Slower due to nested recursion
    public static void sort_REC(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();
            
            // Recursively sort the remaining stack
            sort(stack);
            
            // Insert the popped element back in sorted order
            sortedInsert(stack, top);
        }
    }

    // Helper function to insert an element in sorted order
    private static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            // Remove the top element
            int top = stack.pop();
            
            // Recursively insert the element
            sortedInsert(stack, element);
            
            // Put the popped element back
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(30);
        st.push(40);
        System.out.println(sort(st));
    }
}
