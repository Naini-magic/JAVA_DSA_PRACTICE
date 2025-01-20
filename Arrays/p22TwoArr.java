import java.util.*;
public class p22TwoArr{
    public static void main(String[] args){
       int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
       int a2[] = {11, 3, 7, 1, 7};
       int n = a1.length;
       int k = a2.length;
       System.out.println(subArr(a1, a2, n, k));
    }
    public static boolean subArr(int arr1[] , int arr2[] , int n ,int k){
        HashSet<Integer> arr = new HashSet<Integer>();
        for(int i = 0 ; i < arr1.length ; i++){
            arr.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++) {
            if(arr.contains(arr2[i])){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}