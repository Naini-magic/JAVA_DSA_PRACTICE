
/*Longest consecutive subsequence
Difficulty: MediumAccuracy: 33.0%Submissions: 307K+Points: 4
Given an array of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence. */

import java.util.Arrays;

public class p20 {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };
        System.out.println(SubLong(arr));
        int arr2[] = { 1, 9, 3, 10, 4, 20, 2};
        System.out.println(SubLong(arr2));
  
    }
    public static int SubLong(int []arr){
        if(arr.length==0) return 0;
      Arrays.sort(arr);
      int longStreak =  1; 
      int currentStreak = 1 ;
      
        for(int i = 1 ; i < arr.length; i++ ){
            if(arr[i] == arr[i - 1]) {
                continue;
            }
           else if(arr[i] == arr[i-1]+1 ) {
            currentStreak++;
           }
           else {
            longStreak = Math.max(longStreak, currentStreak);
            currentStreak = 1;  // Reset the current streak
        }
    }
    return Math.max(longStreak, currentStreak);
       
    }
}
