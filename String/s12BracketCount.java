import java.util.Stack;

public class s12BracketCount {
    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(BracketCount(s));
        String s2 = "()";
        System.out.println(BracketCount(s2));
        String s3 = "([]";
        System.out.println(BracketCount(s3));

    }

    public static boolean BracketCount(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
