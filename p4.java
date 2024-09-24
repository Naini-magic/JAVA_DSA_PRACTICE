import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        int arr[] = {8,5,6,9,4,6,3,7};
        rotate(arr);
        // System.out.println(Arrays.toString(arr));
    }
    // public static void rotate(int arr[]){
    //     int n = arr.length - 1;
    //     int first = arr[0];
    //     int last = arr[n];
    //     System.out.println(first);
    //     System.out.println(last);
    //     System.out.println("Array");
    //     arr[0] = last;
    //     for(int i = 0 ; i < n ; i++){
    //         if(i == 0 || i == 1){
    //          arr[0] = last;
    //          arr[1] = first;
    //         }else{
              
    //         }
    //     }
    // }

    public static void rotate(int arr[]){
        int n = arr.length;
        int temp [] = new int[n];
        int j = 0;
        int last = arr[n-1];
        System.out.println(last);
        System.out.println("Array");
        temp[j] = last;
        for(int i = 0 ; i < n-1 ; i++){
           temp[++j] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
