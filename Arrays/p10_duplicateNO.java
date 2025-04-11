public class p10_duplicateNO {
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 2, 3, 4 , 5};
        System.out.println(findDuplicate(arr));

    }
 

    // Floyd’s Tortoise and Hare Algorithm
        public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        fast = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
}}
