import java.util.*;

public class ls18_Height{
    public static int woodCollection(int arr[] ,int mid){
        int collection = 0;
        for(int h : arr){
            if(h > mid){
                collection += h - mid;
            }
        }
        return collection;
    }
    public static int height(int []arr , int tree_s , int hei_req){
        
        int low = 0;
        int high = Arrays.stream(arr).max().getAsInt();
        int result = 0;

        while(low <= high){
            int mid = (low + high)/2;
            int wood_coll = woodCollection(arr , mid);

            if(wood_coll >= hei_req){
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String [] args){
        int arr[] = {4 , 42 , 40 , 26 , 46};
        int h = 20;
        int n = 5;
        System.out.println(height(arr , n , h));
    }
}