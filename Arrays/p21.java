/* 
 Given an array of size n and an integer k, find all elements in the array that appear more than n/k times. 

Examples:


Input: arr[] = {3, 1, 2, 2, 1, 2, 3, 3}, k = 4
Output: {2, 3}
Explanation: Here n/k is 8/4 = 2, therefore 2 appears 3 times in the array that is greater than 2 and 3 appears 3 times in the array that is greater than 2


Input: arr[] = {9, 8, 7, 9, 2, 9, 7}, k = 3
Output: {9}
Explanation: Here n/k is 7/3 = 2, therefore 9 appears 3 times in the array that is greater than 2.


*/

import java.util.*;

public class p21 {
    public static void main(String[] args) {
        int  arr[] = {3, 1, 2, 2, 1, 2, 3, 3}, k = 4;
        System.out.println(countOccurance(arr, k));
        int  arr2[] = {9, 8, 7, 9, 2, 9, 7}, k2 = 3;
        System.out.println(countOccurance(arr2, k2));

    }

    // public static ArrayList<Integer> Gr(int []arr , int k){


    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
    // int n = arr.length;
    
    // ArrayList<Integer> Ar = new ArrayList<>();
    // int count = 1 ;
    
    // for(int i = 1 ; i < n ; i++){
    //    if(count > n/k) {
    //     Ar.add(arr[i]);
    //     count = 1;
    //    }
    //    if(arr[i] == arr[i-1]){
    //     count++;
    //    }
    //    else{
    //     count = 1;
    //    }
    // }
    // return Ar;
    // }
    
public static List<Integer>  countOccurance(int []arr , int k ) {
    int n = arr.length;
    int barrier = n/k ;
    HashMap<Integer , Integer> map = new HashMap<>(); 
    
    for(int i = 0 ; i< n ; i++){
        // map.put(arr[i] , map.getOrDefault(arr[i] , 0 )+1);

         // is element doesn't exist in hash table
         if (!map.containsKey(arr[i]))
         map.put(arr[i], 1);

     // if element does exist in the hash table
     else {
         int count = map.get(arr[i]);
         map.put(arr[i], count + 1);
     }
    }

    List<Integer> result = new ArrayList<>();
    for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
        if(entry.getValue() > barrier) {
            result.add(entry.getKey());
        }
    }
    return result;
} 
}  
