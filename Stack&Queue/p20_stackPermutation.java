import java.util.Stack;

public class p20_stackPermutation {
    public static boolean checkPerm(int[] a, int[] b) {
        // code here
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < n; i++) {
            stack.push(a[i]);
            while (!stack.isEmpty() && stack.peek() == b[j]) {
                stack.pop();
                j++;
            }
        }

        return j == n;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {3 , 1,2};
        System.out.println(checkPerm(a , b));
        int c[] = {2,1,3};
        System.out.println(checkPerm(a , c));
    }
}
