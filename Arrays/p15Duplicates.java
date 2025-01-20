import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class p15Duplicates {
    public static void duplicates(int []arr1 , int []arr2 , int []arr3){
     
      ArrayList<Integer> temp = new ArrayList<>();
int i = 0 , j = 0 , k = 0;
    while(i < arr1.length && j < arr2.length && k < arr3.length){
        if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
            if(temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]){
            temp.add(arr1[i]);
            }
            i++;
            j++;
            k++;
        }
        else if(arr1[i] < arr2[j] ){
            i++;
        }else if(arr2[j] < arr3[k] ){
            j++;
        }else{
            k++ ;
        }

         // Skip duplicates in arr1
         while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
            i++;
        }

        // Skip duplicates in arr2
        while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
            j++;
        }

        // Skip duplicates in arr3
        while (k > 0 && k < arr3.length && arr3[k] == arr3[k - 1]) {
            k++;
        }
    }

   
    System.out.println(temp);
 
    }
    
    
    public static void main(String[] args) {
        
        int []arr1 = {1, 5, 10, 20, 40, 80};
        int []arr2 = {6, 7, 20, 80, 100} ;
        int []arr3 = {3, 4, 15, 20, 30, 70, 80, 120};


        // int []arr1 = {1, 1, 1, 2, 2, 2}; 
        // int []arr2 = {1, 1, 2, 2, 2};
        // int []arr3 = {1, 1, 1, 1, 2, 2, 2, 2};
        duplicates(arr1, arr2, arr3);
    }
}
