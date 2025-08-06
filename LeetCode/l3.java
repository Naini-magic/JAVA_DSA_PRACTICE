import java.util.Arrays;



public class l3 {
       public static void rotate(int[] nums, int k) {
        k = k % nums.length;  // Fix for large k
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4, 5, 6 ,7};
        int k = 3;
        rotate(arr , k);
       System.out.println(Arrays.toString(arr));
    }
}

