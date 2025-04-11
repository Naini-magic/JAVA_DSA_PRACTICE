import java.util.Arrays;

public class p8_MINIMUM_Jump {
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9,2,6,7,6,8,9,1};
        System.out.println(Min(arr));

        System.out.println(minJumps(arr));

        int arr2[] = {1,4,3,2,6,7};
        System.out.println(Min(arr2));
        int arr3[] = {0 , 10 , 20};
        System.out.println(Min(arr3));
    }


    // https://www.youtube.com/watch?v=LDJoBl-bUy4

    public static int minJumps(int[] arr){
        if(arr[0] == 0 ) return -1;
        int ans = 1 , jump = arr[0] , mx = 0;
        for(int i = 1 ; i < arr.length ; i++){
            mx--;
            jump--;
            mx = Math.max(mx, arr[i]);
            if(jump == 0 && i != arr.length-1){
                if(mx <= 0) return -1;
                jump = mx;
                mx = 0;
                ans++;
            }
            
        }
        return ans;
    }


    
   public static int Min(int []arr){
    if(arr.length <= 1){
        return 0;
    }
    if(arr[0] == 0){
        return -1;
    }

    int maxReach = arr[0];
    int step = arr[0];
    int jump = 1;

    for(int i = 1 ; i < arr.length ; i++){
        if(i == arr.length-1){
            return jump;
        }
        maxReach = Math.max(maxReach, i + arr[i]);
        step--;
        if(step == 0){
            jump++;
            if(i >= maxReach){
                return -1;
            }
            step = maxReach - i ;
        }
    }
    return -1;
   }
}
