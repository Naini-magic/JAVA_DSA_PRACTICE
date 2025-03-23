import java.util.Stack;

public class p15_reverse {
    static void Reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        // Step 1: Remove the top element
        int top = st.pop();

        // Step 2: Recursively reverse the remaining stack
        Reverse(st);

        // Step 3: Insert the removed element at the bottom
        insertAtBottom(st, top);
    }

    // Helper function to insert element at bottom of stack
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(7);
        st.push(6);

        System.out.println("Original Stack: " + st);
        
        Reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}