import java.util.Arrays;

public class m6 {
    public static int[][] sortedMatrix(int Mat[][]) {
        // code here
        int r = Mat.length;
        int c = Mat[0].length;
        int arr[] = new int[r * c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[k++] = Mat[i][j];
            }
        }

        Arrays.sort(arr);

        int l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Mat[i][j] = arr[l++];
            }
        }
        return Mat;
    }

    // by selection sort 
    public static int[][] inPlaceSortMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        for (int i = 0; i < m * n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < m * n; j++) {
                int r1 = minIdx / n, c1 = minIdx % n;
                int r2 = j / n, c2 = j % n;

                if (mat[r2][c2] < mat[r1][c1]) {
                    minIdx = j;
                }
            }

            // Swap elements
            int r1 = i / n, c1 = i % n;
            int r2 = minIdx / n, c2 = minIdx % n;

            int temp = mat[r1][c1];
            mat[r1][c1] = mat[r2][c2];
            mat[r2][c2] = temp;
        }

        return mat;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        int[][] sorted = sortedMatrix(arr);
        for (int[] row : sorted) {
            System.out.println(Arrays.toString(row));
        }


        int[][] sort = inPlaceSortMatrix(arr);
        for (int[] row : sort) {
            System.out.println(Arrays.toString(row));
        }
    }
}
