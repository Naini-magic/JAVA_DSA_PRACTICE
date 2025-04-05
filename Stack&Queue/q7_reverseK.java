import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q7_reverseK {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> st = new Stack<>();
        if(q.isEmpty() || k <= 0 || k > q.size()){
            return q;
        }
        
        for(int i = 0 ; i < k ; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        for(int i = 0 ; i < q.size()-k ; i++ ){
            q.add(q.poll());
        }
        
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(reverseFirstK(q , k));
    }
}
