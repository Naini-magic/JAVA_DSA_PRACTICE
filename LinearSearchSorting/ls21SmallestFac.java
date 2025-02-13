/*Smallest factorial number
Difficulty: MediumAccuracy: 38.79%Submissions: 41K+Points: 4
Given a number n. The task is to find the smallest number whose factorial contains at least n trailing zeroes.

Example 1:

Input:
n = 1
Output: 5
Explanation : 5! = 120 which has at
least 1 trailing 0.
Example 2:

Input:
n = 6
Output: 25
Explanation : 25! has at least
6 trailing 0. */





/*🔹 Understanding Trailing Zeroes in Factorial
A trailing zero in a number is produced by factors of 10.
A factorial (n!) has trailing zeroes when it includes factors of 10, which are formed by pairs of 2s and 5s.
Since 2s are more frequent than 5s in factorials, the number of trailing zeroes is determined by the count of factor 5s. */

public class ls21SmallestFac{
    public static void main(String[] args){
      int n = 7;
      System.out.println(findNum(n));
    }
    public static int findNum(int n){
        if(n == 0) return 0;
        int low = 0 , high = 5 * n; //The reason for 5 * n is that every multiple of 5 contributes to trailing zeroes.
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int zeroes = counttrailingnumber(mid);

            if(zeroes >= n){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int  counttrailingnumber(int x){
      int count = 0 ;
      while ( x >= 5){
        count += x / 5;
        x = x/5;
      }        
      return count;
    }
}