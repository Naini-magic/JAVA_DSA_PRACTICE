public class ls8_Jump{
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

    }
}