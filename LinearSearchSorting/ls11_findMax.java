/*Stickler the thief wants to loot money from n houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot. Given an array, arr[] where arr[i] represents the amount of money in the i-th house, find the maximum amount he can loot.

Examples:

Input: arr[] = [6, 5, 5, 7, 4]
Output: 15
Explanation: Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.
Input: arr[] = [1, 5, 3]
Output: 5
Explanation: Loot only 2nd house and get maximum amount of 5. */




/// wrong solution
public class ls11_findMax{
    public static int findMaxSum(int[] arr){
       int i = 0;
       int j = 1;
       int sum = 0;
       int sum2 = 0;
       while(i < arr.length){
         sum += arr[i];
         i += 2;
       }
       while(j < arr.length){
        sum2 += arr[j];
        j += 2;
       }
       int ans = Math.max(sum , sum2);
       return ans;
    }
    public static void main(String [] args){
        int arr[] = {6, 5, 5, 7, 4};
        System.out.println(findMaxSum(arr));
        int arr2[] = {4,4,4,4};
        System.out.println(findMaxSum(arr2));

    }
}