import java.util.Arrays;

public class p25ThreePartition {
    public static void main(String[] args) {
        int array[] = { 1, 4, 3, 6, 2, 1 };

        int a = 1;
        int b = 3;
        System.out.println(ThreePartition(array , a , b));
    }

    public static int ThreePartition(int[] arr, int a, int b) {
        int left = 0;
        int current = 0;
        int high = arr.length - 1;

        while (current <= high) {
            if (arr[current] < a) {
                int temp = arr[current];
                arr[current] = arr[left];
                arr[left] = temp;
                left++;
                current++;
            } else if (arr[current] > b) {
                int temp = arr[current];
                arr[current] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                current++;
            }
        }
        return 1;
    }
}
