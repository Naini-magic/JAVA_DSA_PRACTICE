public class ls11_findMax{
    public static int findMaxSum(int[] arr){
       int i = 0;
       int j = 1;
       int sum = 0;
       int sum2 = 0;
       while(i < arr.length){
         sum += arr[i];
         i += 2;
       }
       while(j < arr.length){
        sum2 += arr[j];
        j += 2;
       }
       int ans = Math.max(sum , sum2);
       return ans;
    }
    public static void main(String [] args){
        int arr[] = {6, 5, 5, 7, 4};
        System.out.println(findMaxSum(arr));
        int arr2[] = {4,4,4,4};
        System.out.println(findMaxSum(arr2));

    }
}