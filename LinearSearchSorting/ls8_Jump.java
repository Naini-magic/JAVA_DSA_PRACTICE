public class ls8_Jump{
    /*A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
Examples: 
 

Input : arr[] = {4, 5, 6, 7, 6}
           k = 1
           x = 6
Output : 2
The first index of 6 is 2. */
    public static int findStepKeyIndex(int[] arr, int k, int x) {
        int i = 0 ;
        
        while(i < arr.length ){
            if(arr[i] == x){
                return i;
            }
            
            i += Math.max(1 , Math.abs(arr[i] - x) / k);
        }
        return -1;
    }

    public static void main (String [] args){
        int arr[] = {4, 5, 6, 7, 6};
        System.out.println(findStepKeyIndex(arr , 1 , 6));
        int arr2[] = {20, 40, 50};
        System.out.println(findStepKeyIndex(arr2 , 20 , 70));
        
        int arr3[] = {20, 40, 50, 70, 70, 60}  ;
        System.out.println(findStepKeyIndex(arr3 , 20 , 60));

    }
}