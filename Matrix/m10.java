public class m10 {
    import java.util.Arrays;


/* 
public class m9 {
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
    static void printMatrix(int mat[][]) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    // Function to return the kth smallest element after sorting
    public static int findKthSmallest(int[][] mat, int k) {
        inPlaceSortMatrix(mat);
        int n = mat[0].length;
        int row = (k - 1) / n;
        int col = (k - 1) % n;
        return mat[row][col];
    }
    
    public static void main (String [] args){
        int mat[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        int k = 7;
        inPlaceSortMatrix(mat);
        printMatrix(mat);
        System.out.println(findKthSmallest(mat, k));
    }
}
*/



public class m9{
        public static int kthSmallest(int[][] mat, int k) {
            int n = mat.length;
            int low = mat[0][0];
            int high = mat[n - 1][n - 1];
    
            while (low < high) {
                int mid = low + (high - low) / 2;
                int count = countLessEqual(mat, mid);
    
                if (count < k) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
    
            return low;
        }
    
        // Counts elements ≤ mid using binary matrix properties
        private static int countLessEqual(int[][] mat, int mid) {
            int n = mat.length;
            int row = n - 1, col = 0;
            int count = 0;
    
            while (row >= 0 && col < n) {
                if (mat[row][col] <= mid) {
                    count += row + 1;
                    col++;
                } else {
                    row--;
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
            };
            int k = 7;
            System.out.println("The " + k + "th smallest element is: " + kthSmallest(mat, k));
        }
    }

}
