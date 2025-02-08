public class ls17_Allocate{


    public static int minPage(int arr[] , int k){
        int sum = 0;
        if(k > arr.length){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }

        int start = 0;
        int end = sum;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(arr , arr.length , k , mid)){
              ans = mid;
              end = mid - 1;
            }else{
             start = mid + 1;
            }
        }
        return ans;
    }

public static boolean isValid(int arr[] ,int n , int m , int mid){
   int st = 1 ;
   int page = 0;
   for(int i = 0 ; i < n ; i++){
    if(arr[i] > mid){
        return false;
    }
    if(page+arr[i] <= mid){
        page += arr[i];
      }
      else{
        st++;
        page =arr[i];
        if(st > m ){
            return false;
        }
      }
    }
      return  true;
}










    // this is not the solution
    public static int minimumPage(int arr[] , int k){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        if(k > arr.length){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
         sum += arr[i];
        }
        if(k == 1){
            return sum;
        }

        System.out.println(sum);
        int as = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            as += arr[i];
            min = Math.min(min , Math.max(as , sum - as));
        }

        return min;
    }
    public static void main(String[] args){
    int  arr[] = {12, 34, 67, 90} , k = 2;
    System.out.println(minPage(arr , k));
    }
}