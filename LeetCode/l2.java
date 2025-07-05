public class l2 {
    
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(candidate == nums[i]){
                count++;
            }else{
                if(count == 0){
                    candidate = nums[i];
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return candidate;
    }
public static void main(String[] args) {
    int arr [] = { 1, 3 , 3 ,4 ,3,3,3,2};
    System.out.println(majorityElement(arr));
}
}
