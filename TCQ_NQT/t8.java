import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int v = sc.nextInt(); // Total number of vehicles
            int w = sc.nextInt(); // Total number of wheels

            if (w % 2 != 0 || w < 2 * v || w > 4 * v) {
                System.out.println(-1);
            } else {
                int fourWheelers = (w - 2 * v) / 2;
                int twoWheelers = v - fourWheelers;
                System.out.println(twoWheelers + " " + fourWheelers);
            }
        }

        sc.close();
    }
}
