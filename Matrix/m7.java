public class m7 {

    public static int MaxDifferencePAir(int mat[][]) {

        int max = Integer.MIN_VALUE;
        int r = 0, c = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] >= max) {
                    max = mat[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] <= min) {
                    min = mat[i][j];
                }
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
      int mat[][] = {{ 1, 2, -1, -4, -20 },
      { -8, -3, 4, 2, 1 }, 
      { 3, 8, 6, 1, 3 },
      { -4, -1, 1, 7, -6 },
      { 0, -4, 10, -5, 1 }};

      System.out.println(MaxDifferencePAir(mat));
    }
}
