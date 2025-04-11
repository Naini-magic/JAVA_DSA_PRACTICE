import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int[] arr1 = {0 , 2 , 1 , 2 , 0};
        System.err.println(Arrays.toString(sort(arr1)));
    }
    public static int[] sort(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
             swap(arr , low , mid);
             mid++;
             low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr , mid , high);
                high--;
            }
        }
        return arr;
    }

    public static void swap(int arr[] , int s , int t){
        int temp = arr[s];
        arr[s] = arr[t];
        arr[t] = temp;
    }
}
