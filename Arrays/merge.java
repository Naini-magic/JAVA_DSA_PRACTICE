import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {20 ,  2,10 ,  4, 1, 3, 5, 0 ,7, 6 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        int count = 0;
               
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        System.out.println(Arrays.toString(arr));
        conquer(arr, start, mid, end);
        
    }

    public static void conquer(int[] arr, int s, int m, int e) {
        // int merge[] = new int[e - s + 1];

        int id1 = s;  // 1st array ko track kr rha h
  
        int id2 = m + 1; // 2nd array ko track kr rha h
  
        while (id1 <= m && id2 <= e) {
            if (arr[id1] <= arr[id2]) {
                // merge[k++] = arr[id1++];
                k++;
                id1++;
            } else {
                int temp = arr[id1];
                arr[id1] = arr[id2];
                arr[id2] = temp;
                id1++;

                
                divide(arr, id2 , e);
            }
        }

        // while (id1 <= m) {
        //     merge[k++] = arr[id1++];
        // }

        // while (id2 <= e) {
        //     merge[k++] = arr[id2++];
        // }

        // for (int i = 0, j = s; i < merge.length; i++, j++) {
        //     arr[j] = merge[i];
        // }
    }
}
