import java.util.HashSet;

public class p17Sum {
      static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        
        for(int i = 0 ; i < n ; i ++ ){
            
           sum += arr[i];
            
            if(sum == 0 || set.contains(sum)){
                return true;
            }
            
            set.add(sum);
            
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = arr.length;
        
        if (findsum(arr, n)) {
            System.out.println("Yes, there is a subarray with sum 0");
        } else {
            System.out.println("No, there is no subarray with sum 0");
        }
    }
}
