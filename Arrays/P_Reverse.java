import java.util.Arrays;

public class P_Reverse {
    // reverse the arr
    public static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // find min and max
    public static void minmax(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("mmin = " + min);
        System.out.println("MAx = " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 6, 7, 5 };
        reverse(arr);

        minmax(arr);
    }
}
