import java.util.ArrayList;

public class ls2 {
    public static ArrayList<Integer> value_equal(int []arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            if(i+1 == arr[i] ){
              ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
      int arr[] = { 15 , 2 , 45 , 4 ,7};
      System.out.println(value_equal(arr));
    }
}
