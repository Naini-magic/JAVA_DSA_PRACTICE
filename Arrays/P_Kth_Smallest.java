/*
 Kth Smallest
Difficulty: MediumAccuracy: 35.17%Submissions: 666K+Points: 4
Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
*/

import java.util.Arrays;

public class P_Kth_Smallest {
    public static void divide(int arr[] , int s , int e){
        if(s >= e){
            return;
        }
        int mid = s+(e-s) / 2;
      divide(arr, s, mid);
      divide(arr, mid+1, e);

      conquer(arr , s , mid , e);
    }


    public static void conquer(int[] arr , int s , int m , int e){
        int merge[] =  new int [e - s + 1];
        int id1 = s;
        int id2 = m+1;

        int k = 0;
        while (id1 <= m && id2 <= e) {
            if (arr[id1] < arr[id2]) {
              merge[k++] = arr[id1++];  
            }else{
                merge[k++] = arr[id2++];
            }
        }


        while (id1<= m) {
            merge[k++] = arr[id1++];
        }
        while (id2 <= e) {
            merge[k++] = arr[id2++];
        }


        for(int i = 0 , j = s; i < merge.length ; i++ , j++){
            arr[j] = merge[i];
        }
    }


    public static void main(String[] args){
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        divide(arr, 0, arr.length-1);
      
        System.out.println("Sorted Array: " + Arrays.toString(arr)); 
        System.out.println(arr[k-1]); 
    }
}
