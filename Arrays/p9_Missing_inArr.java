/*Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive), find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

Examples:

Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4. */


public class p9_Missing_inArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20};
        int n = 20;
        System.out.println(Miss(arr, n));
    }
    public static int findMissing(int[] arr, int n) {
        // Calculate sum of the first n natural numbers
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the expected sum and actual sum
        return totalSum - arraySum;
    }



    // my approach
    public static int Miss(int[] arr , int n) {
        if(n == 0 || n == 1){
            return -1;
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != i+1){
              return i+1;
            }
        }
        return -1;
    }
}
