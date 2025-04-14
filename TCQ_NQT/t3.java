import java.util.Scanner;

public class t3 {
    public static int Count(int arr[][]) {
        int cur = 0;
        int max = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    cur++;
                }
            }
            if (cur > max) {
                max = cur;
                ans = i;
            }
            cur = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            int arr[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println(Count(arr));

        }
    }
}
