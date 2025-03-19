import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class p10_NLE {
     public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length ;
         ArrayList<Integer> ar = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length - 1 ; i >= 0 ; i-- ){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            
            if(!s.isEmpty()){
                ar.set(i , s.peek());
            }
            
            s.push(arr[i]);
        }
        return ar;
    }

    public static void main(String[] args) {
        p10_NLE sol = new p10_NLE();
        int arr[] = {6 , 1 , 8 , 0 , 2 , 4};
        System.out.println(sol.nextLargerElement(arr));
    }
}
