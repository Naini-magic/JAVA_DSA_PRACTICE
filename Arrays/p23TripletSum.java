import java.util.Arrays;

public class p23TripletSum {
    public static void main(String[] args) {
        int n = 6, x = 13;
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        System.out.println(TripletSum(arr, x));
    }

    public static int TripletSum(int[] arr, int x) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int leftP = i + 1;
            int rigthP = arr.length - 1;

            while (leftP < rigthP) {
                int sum = arr[i] + arr[leftP] + arr[rigthP];

                if (sum == x) {
                    return 1;
                } else if (sum < x) {
                    leftP++;
                } else {
                    rigthP--;
                }
            }
        }
        return 0;
    }
}
