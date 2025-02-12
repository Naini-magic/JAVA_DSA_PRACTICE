/*Triplets with Smaller Sum
Given an array arr[] of distinct integers of size n and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.


Examples :


Input: n = 4, sum = 2, arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with sum less than 2 (-2, 0, 1) and (-2, 0, 3).  */

import java.util.*;
public class ls12TripletsSum{

public static int TripletsSmallerSum(int arr[] , int n , int sum ){
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int count = 0;

    for(int i = 0 ; i < n - 2 ; i++){
        int j = i+1;
        int k = n-1;
        while(j < k){
        long sumtem = (long) arr[i] + arr[j] + arr[k];
           if(sumtem < sum){
                count += k - j;
                j++;
            }else{
                k--;
            }
        }
    }
    return count;
}


public static void main (String [] args){
     int  n = 4, sum = 2, arr[] = {-2, 0, 1, 3};
     System.out.println(TripletsSmallerSum(arr , n , sum));
     int  n1 = 5, sum1 = 12, arr1[] = {5, 1, 3, 4, 7};
     System.out.println(TripletsSmallerSum(arr1 , n1 , sum1));

}}