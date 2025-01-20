import java.util.Arrays;

public class p29MedianTwo {
    public static void main(String[] args) {
        int n = 2, m = 4;
        int array1[] = { 4, 6 };
        int array2[] = { 1, 2, 3, 5 };
        System.out.println(medianTwo(n, m, array1, array2));
    }

    public static double medianTwo(int n, int m, int a[], int b[]) {

        int merge[] = new int[n + m];
        for(int i = 0 ; i <  a.length ; i++){
            merge[i] = a[i];
        }
        for(int i = 0 ; i <  b.length ; i++){
            merge[n+i] = b[i];
        }

        Arrays.sort(merge);

        if (merge.length % 2 == 0) {
            int k = merge.length / 2;
            return (merge[k - 1] + merge[k]) / 2.0;
           

        } else {
            return merge[merge.length / 2];
        }
    }
}
