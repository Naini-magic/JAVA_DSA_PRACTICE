import java.util.Arrays;

public class p31Minimize_height {
  public static void main(String[] args) {
    
  }  
  public static int min(int arr[] , int k){
    Arrays.sort(arr);
    int n = arr.length;
    int max = arr[n - 1];
    int min = arr[0];
    int d = max  - min ;

    for(int i = 1 ; i < arr.length ; i++ ){
        if(arr[i] - k < 0){ continue; }
     
        max = Math.max(arr[n - 1 ] - k , arr[i - 1] + k);
     
        min = Math.min(arr[0] + k , arr[i] - k);
       
        int diff = max - min ;
     
        if (diff < min ){
            min = diff ;
        }
    }
    return min;
  }
}
