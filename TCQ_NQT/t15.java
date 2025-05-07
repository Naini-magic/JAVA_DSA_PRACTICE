import java.util.Scanner;

public class t15 {
       public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine(); /*Java's nextInt() does not consume the newline (\n) after the 2.
        So when you then call sc.nextLine(), it immediately reads the leftover newline, giving you an empty string (""). */
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        // Reverse the array
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the (k-1)th character (since arrays are 0-indexed)
        System.out.println(arr[k - 1]);

    } 
}
