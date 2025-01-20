/*Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
 */

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
       int k = 2;
       int arr[] = {1, 5, 8, 10};
         dif(arr, k);
       int  k2 = 3;
       int arr1[] = {3, 9, 12, 16, 20};
       dif(arr1, k2);
    }
    public static void dif(int arr[] , int k){
        for(int i = 0 ; i < arr.length ; i++){
            if(k >= arr[i]){
             arr[i] = k + arr[i];
            }else{
                arr[i] = arr[i] - k;
            }
        }
        Arrays.sort(arr);
        int d = arr[arr.length - 1] - arr[0];
        System.out.println(d);
    }
}
