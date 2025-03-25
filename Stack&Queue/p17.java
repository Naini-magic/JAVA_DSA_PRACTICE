import java.util.Stack;

public class p17 {
    public static int Valid_Paranthesis(String st) {
        int max = 0;
        Stack<Integer> ele = new Stack<>();
        ele.push(-1);
        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) == '(') {
                ele.push(i);
            } else {
                ele.pop();
                if (!ele.isEmpty()) {
                    max = Math.max(max, i - ele.peek());
                } else {
                    ele.push(i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(())(";
        System.out.println(Valid_Paranthesis(s));
        s = "(()(";
        System.out.println(Valid_Paranthesis(s));
        s = "()(())(";
        System.out.println(Valid_Paranthesis(s));
        s = "(()())";
        System.out.println(Valid_Paranthesis(s));
        s = "(()())()()()()((((((((())))))))))()()()()()()))))))))))))))))))(((((((((((((((())))))))))))))))))((((((((((((((((())))))))))))))))))))()()()()()()()()()()()()(";
        System.out.println(Valid_Paranthesis(s));
    }
}
