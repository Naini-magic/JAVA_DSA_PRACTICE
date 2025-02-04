import java.util.*;

public class ls19_ZeroSum{
    public static int ZeroSum(int arr[]){

        HashSet<Integer> sumCollection = new HashSet<>();

        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
        sum += arr[i];
            if(sum == 0 || sumCollection.contains(sum)){
            ans++;
            }else{
                sumCollection.add(sum);
            }
        }

        return ans;
    }
        
        public static void main(String[] args){
        int arr[] = {6 , -1 , -3 , 4 , -2 , 2 , 4 , 6 , -12 , -7};
        System.out.println(ZeroSum(arr));
    }
}