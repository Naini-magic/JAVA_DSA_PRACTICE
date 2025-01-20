import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove {
    public static void main(String[] args) {
        int []arr = {2, 2, 3, 3, 7, 5};
        int []arr2 = {4 ,7, 6, 4,10 ,10, 9, 3, 7, 7, 5};
        System.out.println(removeDuplicate(arr));
        System.out.println(removeDuplicate(arr2));
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates(arr2));
    }
     public static ArrayList<Integer> removeDuplicate(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(arr[0]);
        // code here
        int i = 1 ;
        while(i < arr.length)
        {
            if(arr[i] == arr[i-1]){
                i++;
            }
            else{
                n.add(arr[i]);
                i++;
            }
        }
        return n;
    }

    public static List<Integer> removeDuplicates(int[] arr) {
        // Use LinkedHashSet to remove duplicates and maintain order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert the set to a list for output
        return new ArrayList<>(set);
    }
}
