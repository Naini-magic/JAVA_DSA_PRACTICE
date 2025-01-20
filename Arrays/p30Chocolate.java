import java.util.Arrays;

public class p30Chocolate {
    public static void main(String[] args) {
       int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
       int n = 5;
       System.out.println(min(arr, n)); 

      int arr2[] = {7, 3, 2, 4, 9, 12, 56}, m = 3;
      System.out.println(min(arr2, m));
    }

    public static int min(int[] arr , int n ){
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i <arr.length-n; i++){
          ans = Math.min(ans , arr[i+n-1] - arr[i]);
        }
        return ans;
    }

}
