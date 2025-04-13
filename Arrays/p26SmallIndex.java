public class p26SmallIndex {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 3 }, K = 3;
        System.out.println(MinSwap(arr, K));
        int arr2[] = { 2, 7, 9, 5, 8, 7, 4 }, K2 = 6;
        System.out.println(MinSwap(arr2, K2));
    }

    public static int MinSwap(int arr[], int k) {

        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int minSwap = bad;
        for (int i = 0, j = count; j < n; i++, j++) {

            if (arr[i] > k) {
                bad--;
            }
            if (arr[j] > k) {
                bad++;
            }
            minSwap = Math.min(minSwap, bad);
        }
        return minSwap;
    }
}
