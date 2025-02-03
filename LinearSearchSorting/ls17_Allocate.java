public class ls17_Allocate{
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
    int  arr[] = {12, 34, 67, 90} , k = 3;
    System.out.println(minimumPage(arr , k));
    }
}