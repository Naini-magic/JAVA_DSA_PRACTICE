import java.util.Arrays;

public class P_SORT_012 {
    /// best way to solve it Dutch National Flag Algorithm
  public static void sort_algo(int[] arr){
    int low = 0 ;
    int mid = 0;
    int high = arr.length-1;

    while (mid <= high) {
        if(arr[mid] == 0 ){
            swap(arr ,mid , low);
            mid++;
            low++;
        }else if(arr[mid] == 1){
            mid++;
        }else{
            swap(arr , mid , high);
            high--;
        }
    }

    System.out.println(Arrays.toString(arr));
  }
    public static void swap(int[] arr , int s , int second){
        int temp = arr[s];
        arr[s] = arr[second];
        arr[second] = temp;
    }
  

    // my way
    public static void sort(int arr[]) {
        int one = 0;
        int two = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            } else {
                zero++;
            }
        }

        int temp[] = new int[arr.length];
        int k = 0;
        for (int i = zero; i > 0; i--, k++) {
            temp[k] = 0;

        }
        for (int i = one; i > 0; i--, k++) {
            temp[k] = 1;

        }
        for (int i = two; i > 0 && k < arr.length; i--, k++) {
            temp[k] = 2;

        }

        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
      //  sort(arr);
      sort_algo(arr);
    }
}
