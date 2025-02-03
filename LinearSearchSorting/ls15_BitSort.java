/*Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

Note: For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort.

 
Example 1:
Input: 
arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
Output:
15 7 5 3 9 6 2 4 32
Explanation:
The integers in their binary
representation are:
15 - 1111
7  - 0111
5  - 0101
3  - 0011
9  - 1001
6  - 0110
2  - 0010
4  - 0100
32 - 10000
hence the non-increasing sorted order is:
{15}, {7}, {5, 3, 9, 6}, {2, 4, 32}
  */
import java.util.*;
/*Arrays.sort(arr, comparator) does not work with int[].

The method Arrays.sort() with a custom comparator only works for Object arrays (Integer[], String[], etc.).
You cannot directly use a custom comparator on int[].
How to Fix?

Convert int[] → Integer[]
Use Arrays.sort() with a lambda comparator.
 */
public class ls15_BitSort{
    public static void BitSort(Integer[] arr){
        Arrays.sort(arr , (a , b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countB - countA ;
        });
    }
    public static void main(String []args){
        Integer arr[] = {3,7,8,9};
        BitSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}