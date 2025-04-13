import java.util.HashMap;
import java.util.HashSet;

public class p22SubArr {
    public static void main(String[] args) {
        int a1[] = { 11, 7, 1, 13, 21, 3, 7, 3 };

        int a2[] = { 11, 3, 7, 1, 7 };

        System.out.println(subArr(a1, a2));

        int a3[] = { 10, 5, 2, 23, 19 };
        int a4[] = { 19, 5, 3 };

        System.out.println(subArr(a3, a4));
    }

    public static boolean subArr(int arr1[], int arr2[]) {
        // HashSet<Integer> arr = new HashSet<Integer>();
        // for(int i = 0 ; i < arr1.length ; i++){
        // arr.add(arr1[i]);
        // }

        // for(int i = 0 ; i < arr2.length ; i++) {
        // if(arr.contains(arr2[i]) != true){
        // return false;
        // }
        // }
        // return true;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Traverse arr2 and check if its elements exist in sufficient frequency in arr1
        for (int num : arr2) {
            if (!freq.containsKey(num) || freq.get(num) <= 0) {
                return false;
            }

            freq.put(num, freq.get(num) - 1); // Decrease the frequency count for the matched element
        }
        return true; // All elements of a2 found with sufficient frequency in arr1

    }
}
