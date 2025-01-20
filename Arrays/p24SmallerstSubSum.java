public class p24SmallerstSubSum {
    public static void main(String[] args) {
       int x = 51, arr[] = {1, 4, 45, 6, 0, 19};
       System.out.println(smallestSubWithSum( x ,  arr));
       int x2 = 100, arr2[] = {1, 10, 5, 2, 7};
    System.out.println(smallestSubWithSum(x2, arr2));
    }
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        
        int minlength  = arr.length + 1;
        int start = 0;
        int cursum = 0 ;
        
        for(int end = 0 ; end < arr.length ; end++ ){
            cursum += arr[end];
            
            while(cursum > x) {
                minlength = Math.min(minlength , end - start + 1);
                
                cursum = cursum - arr[start];
                start++ ;
            }
        }
        return (minlength == arr.length + 1) ? 0 : minlength;
    }
}
