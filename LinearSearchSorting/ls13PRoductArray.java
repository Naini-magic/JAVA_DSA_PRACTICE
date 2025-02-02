import java.util.*;
public class ls13PRoductArray{

    public static int[] PRoduct(int arr[]){
       int n = arr.length;
       int [] res = new int[n];


       int leftProduct = 1;
       for( int i = 0 ; i< n ; i++){
        res[i] = leftProduct;
        leftProduct *= arr[i];
       }

       int rightProduct = 1;
       for(int i = n -1 ; i >= 0 ; i--) {
        res[i] *= rightProduct;
        rightProduct *= arr[i];
       }

       return res;
    }



    // solution
    public static int[] productArr(int arr[]){
        int product = 1;
        boolean zero = false;
        int index = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0) {
                index = i;
                zero = true;
                continue;
            }
            product *= arr[i]; 
        }

        System.out.println(product);
        int pro[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){

            if(zero == true){
                pro[i] = 0;
            }else{
            pro[i] = product / arr[i]; 
            // System.out.println(pro[i]);
            }
        }
        if(zero == true){
        pro[index] = product;
        }
        return pro;
    }
    public static void main (String [] args){
      int arr[] = {10, 3, 5, 6, 2};
      System.out.println(Arrays.toString(PRoduct((arr))));
      int arr1[] = {12 , 0};
      System.out.println(Arrays.toString(PRoduct((arr1))));
      int arr2[] = {11 , 4 , 5 , 6 , 7 ,0};
      System.out.println(Arrays.toString(PRoduct((arr2))));
    }
}