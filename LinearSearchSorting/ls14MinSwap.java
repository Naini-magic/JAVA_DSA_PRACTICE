public class ls14MinSwap{



    // my approach tc - O(n2) this is not good
    public static int minSwap(int arr[]){
        int count = 0;
        for(int i = arr.length-1 ; i > 0 ; i--){
            int maxelement = i ;

            for(int j = i-1 ; j >= 0 ; j-- ){
                if(arr[j] > arr[maxelement]){
                   maxelement = j;
                }
            }

            if(maxelement != i){

                int temp = arr[maxelement];
                arr[maxelement] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
           int arr[] = {2, 8, 5, 4};
           System.out.println(minSwap(arr));
           int arr2[] = {10, 19, 6, 3, 5};
           System.out.println(minSwap(arr2));
           int arr3[] = {1, 3, 4, 5, 6};
           System.out.println(minSwap(arr3));

    }
}