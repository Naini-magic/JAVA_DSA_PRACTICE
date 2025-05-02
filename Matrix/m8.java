public class m8 {
        static void rotate(int mat[][]) {
            int n = mat.length;
    
            // Step 1: Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
    
            // Step 2: Reverse each row
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - j - 1];
                    mat[i][n - j - 1] = temp;
                }
            }
        }
    
        // Optional: Method to print the matrix for testing
        static void printMatrix(int mat[][]) {
            for (int[] row : mat) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            rotate(mat);
            printMatrix(mat);
        }
    }
    

