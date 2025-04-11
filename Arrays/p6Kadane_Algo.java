public class p6Kadane_Algo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int arr2[] = { -1, 1, -3, -4 };
        int arr3[] = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(max(arr));
        System.out.println(max(arr2));
        System.out.println(max(arr3));

        // System.out.println(min(arr3));
    }

    public static int max(int arr[]) {
        int maxSum = arr[0];
        int curSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}