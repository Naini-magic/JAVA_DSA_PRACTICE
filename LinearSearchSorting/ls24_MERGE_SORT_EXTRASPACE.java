import java.util.*;

public class ls24_MERGE_SORT_EXTRASPACE{
    public static void main(String [] args){
 int arr[] = { 7 , 3 , 5 , 4 , 9 , 1 , 0 , 6};
 divide(arr , 0 , arr.length- 1);
    }

    public static void divide(int arr[] , int start , int end){
        if(start >= end) return;
      int mid = start + (end - start) / 2;

      divide(arr , start , mid);
      divide(arr , mid+1 , end);

    //   conquer(arr , start , mid , end);
    gapmethodofsort(arr , start , mid , end);


      
      System.out.println(Arrays.toString(arr));
    }


    public static void gapmethodofsort(int arr[] , int start , int mid , int end ){
      
        int gap = end - start + 1;

        while(gap > 1){
            gap = (gap + 1) / 2;

            int i = start , j = start + gap;
            while( j <= end){
                if(arr[i] > arr[j]){
                    // swap element if they are out of order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
        }
    }


    /* Merge Part (Shifting Elements):O(n log n)
     O(n2) in wworst case Works but inefficient in worst case*/
    public static void conquer(int arr[] , int start , int mid , int end) {
       
        int i = start;
        int j = mid + 1;

    while(i <= mid && j <= end){
        if (arr[i] <= arr[j]) {
            i++ ;
        }else{
            int temp = arr[j];
            int k = j;

            while(k > i){
               arr[k] = arr[k - 1];
               k-- ;
            }

            arr[i] = temp ;
            i++;
            j++;
            mid++;
        }
    }}
}