import java.util.ArrayList;
import java.util.Arrays;

public class p14TwoSum {


   public static ArrayList<ArrayList<Integer>> Pair(int arr[]){
    Arrays.sort(arr);
    // System.out.println(arr);

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    for(int i = 0 ; i < arr.length ; i++){
          for(int j = i+1 ; j < arr.length ; j++){
            if( i != j && arr[i] + arr[j] == 0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                ans.add(pair);
            }
          }
    }
    return ans;
   }


   public static void main(String[] args) {
    // int []arr = {-1, 0, 1, 2, -1, -4};
    int []arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
    System.out.println(Pair(arr));
   } 
}
