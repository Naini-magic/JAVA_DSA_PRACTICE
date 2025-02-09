import java.util.*;



// this problem and book allov=cation is kind of very similar beacause in this we have to find the minimum and maxmimun type of answer
public class ls27AggressiveCow{
    public static int aggressive(int arr[] , int c){

        Arrays.sort(arr);
        int start = 1;
        int end = arr[arr.length - 1] - arr[0]; // this will give the max distance between two cows
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(arr , c , mid)){
              ans = mid;
              start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int c , int mid ){
         int cow = 1;
         int lastStallPoss = arr[0];
         for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] - lastStallPoss >= mid){
                cow++;
                lastStallPoss = arr[i];
            }
            if(cow == c) return true;
         }
         return false;
    }
    public static void main(String [] args){

        int arr[] = {1 , 2 , 8 , 4 , 9 };
        int cow = 3;
        System.out.println(aggressive(arr , cow));
    }
}