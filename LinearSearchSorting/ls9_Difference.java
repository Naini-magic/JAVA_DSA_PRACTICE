/*Given an array, arr[] and an integer x, return true if there exists a pair of elements in the array whose absolute difference is x, otherwise, return false.

Examples:

Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78
Output: true
Explanation: Pair (2, 80) have an absolute difference of 78.
Input: arr[] = [90, 70, 20, 80, 50], x = 45
Output: false
Explanation: There is no pair with absolute difference of 45.
Input: arr[] = [1], x = 1
Output: false */


import java.util.HashSet;
import java.util.Arrays;

public class ls9_Difference{
// Optimized Approach
public static boolean FindPair(int[] arr , int x) {
    // code here
    int n = arr.length;
    HashSet<Integer> elements = new HashSet<>();

    // Iterate over the array
    for (int i = 0; i < n; i++) {
        // Check if arr[i] + n or arr[i] - n already
        // exists in the HashSet
        if (elements.contains(arr[i] + x) || elements.contains(arr[i] - x)) {
            return true; // If so, a valid pair is found
        }
        // Add the current element to the HashSet
        elements.add(arr[i]);
    }
    return false; // No valid pair found
}
//Expected Approach

    public boolean findPair(int[] arr, int x) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int n = arr.length;

        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }
        }

        return false;
    }


    // Brute Force Approach

    public static int findPair(int n, int x, int[] arr) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the absolute difference between
                // elements is equal to n
                if (Math.abs(arr[i] - arr[j]) == x) {
                    return 1;
                }
            }
        }
        return -1;
    }



    public static boolean hasPairWithDifference(int arr[] , int x){
      HashSet<Integer> set = new HashSet<>();
      

         // If x == 0, we need to check for duplicate values
         if (x == 0) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : arr) {
                if (seen.contains(num)) {
                    return true; // Duplicate found
                }
                seen.add(num);
            }
            return false; // No duplicate found
        }


      for(int num : arr){
        set.add(num);
      }

    for(int num : arr){
        if(set.contains(num + x)){
            return true;
        }
    }
return false;
      
    }
    public static void main (String [] args){
        int arr[] ={5, 20, 3, 2, 5, 80};
       System.out.println(hasPairWithDifference(arr , 78));
       System.out.println(FindPair(arr , 78));


       int arr2[] = {1, 2, 3 ,4, 5, 6 ,7, 8, 9 ,10};
       System.out.println(hasPairWithDifference(arr2 , 0));
       System.out.println(FindPair(arr2 , 0));
    }

}