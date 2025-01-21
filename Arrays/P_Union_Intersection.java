import java.util.HashSet;
import java.util.Set;

public class P_Union_Intersection {
    public static void union(int arr1[] , int arr2[]){
          Set<Integer> union = new HashSet<>();
          for(int num : arr1){
            union.add(num);
          }
          for(int num : arr2){
            union.add(num);
          }

          System.out.println(union);
    }

    public static void intersection(int arr1[] , int []arr2){
        Set<Integer>  set1 = new HashSet<>();
        Set<Integer> inter = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            if(set1.contains(num)){
                inter.add(num);
            }
        }
        System.out.println(inter);

    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,3,2};
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}
