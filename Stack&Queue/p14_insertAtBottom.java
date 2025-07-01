import java.util.Stack;

public class p14_insertAtBottom {
    static void insert_at_bottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
        } else {
            int a = st.pop();   // Store and remove the top element
            insert_at_bottom(st, x);  // Recursive call
            st.push(a);         // Push the stored element back
        }
    } 
        
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Stack before inserting at bottom: " + st);
        insert_at_bottom(st, 10);
        System.out.println("Stack after inserting 10 at bottom: " + st);
    }
}
