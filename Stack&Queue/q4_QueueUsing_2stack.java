import java.util.ArrayList;
import java.util.Stack;

public class q4_QueueUsing_2stack {

    public static void queue(int arr[][]) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 1) {
                if (st1.isEmpty()) {
                    st1.push(arr[i][1]);
                } else {
                    while (!st1.isEmpty()) {
                        st2.push(st1.pop());
                    }
                    st1.push(arr[i][1]);
                    while (!st2.isEmpty()) {
                        st1.push(st2.pop());
                    }
                }
            } else {
                if (st1.isEmpty()) {
                 ans.add(-1);
                }else{
                    ans.add(st1.pop());
                }
            }
        }
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 1, 3 }, { 2 }, { 1, 4 }, { 2 } };
        queue(arr);
        int arr2[][] = {{1,2} , {2} , {2} , {1,4}};
        queue(arr2);
    }
}
