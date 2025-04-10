import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class q10_negIn{
     public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>(); // Use Deque to efficiently remove elements from the front
        
        // Process first 'k' elements
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.addLast(i);
            }
        }

        // Process the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Add first negative number of the previous window
            if (!q.isEmpty()) {
                result.add(arr[q.peekFirst()]);
            } else {
                result.add(0);
            }

            // Remove elements that are out of the current window
            while (!q.isEmpty() && q.peekFirst() <= i - k) {
                q.pollFirst();
            }

            // Add new negative element if found
            if (arr[i] < 0) {
                q.addLast(i);
            }
        }

        // Handle the last window separately
        if (!q.isEmpty()) {
            result.add(arr[q.peekFirst()]);
        } else {
            result.add(0);
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10} , k = 2 ;
        System.out.println(firstNegInt(arr, k));
    }
}