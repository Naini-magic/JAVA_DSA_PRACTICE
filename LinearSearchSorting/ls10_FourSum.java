import java.util.*;

public class ls10_FourSum{


    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length; 

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // Skip duplicates for j

                int left = j + 1, right = n - 1; // Two pointers
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right]; // Use long to avoid overflow
                    
                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        // Skip duplicates for left and right
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 2, 1, 1};
        int target1 = 3;
        System.out.println(fourSum(arr1, target1)); // Output: [[0, 0, 1, 2]]

        int[] arr2 = {10, 2, 3, 4, 5, 7, 8};
        int target2 = 23;
        System.out.println(fourSum(arr2, target2)); // Output: [[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]]
           
        // System.out.print(fourSum1(arr2, target2));
}}