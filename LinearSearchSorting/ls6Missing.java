import java.util.Arrays;
public class ls6Missing {


    // time complixity O(nlogn)
    public static void missing(int arr[]){
        int n = arr.length ;
        Arrays.sort(arr);
        int repeat = -1;
        int sum =0;
       for(int i = 0 ; i < n - 1 ; i++){
        sum +=arr[i];
        if(arr[i] == arr[i+1]){
         repeat = arr[i];
        }
    }
        sum += arr[n - 1];

       int totalsum = (n*(n+1))/2;
       System.out.println(repeat);
       
       int ans = sum - repeat;
       System.out.println(totalsum-ans);
       
    }

    public static void main (String[] args){
       int arr[] = {2,2};
       missing(arr);
       int arr2[] = {1, 3, 3};
       missing(arr2);


       int arr3[] = { 1 , 1 , 2 , 3 , 4  , 6};
       missing(arr3);

    }
}