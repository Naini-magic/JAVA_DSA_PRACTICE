import java.util.Arrays;

public class p28Median {
  public static void main(String[] args) {
    int arr[] = { 90, 100, 78, 89, 67 };
    System.out.println(MEdian(arr));
    int ar[] = { 56, 67, 30, 79 };
    System.out.println(MEdian(ar));
  }

  public static int MEdian(int arr[]) {
    Arrays.sort(arr);

    if (arr.length % 2 == 0) {
      int i = arr.length / 2;
      return (arr[i - 1] + arr[i]) / 2;
    } else {
      return arr[arr.length / 2];
    }
  }
}
