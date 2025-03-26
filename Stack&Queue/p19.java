public import java.util.Stack;

public class p18_repeated {
    public static boolean Repeated(String st) {
        Stack<Character> stack = new Stack<>();
        for (char c : st.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                stack.push(c);
            } else if (c == ')') {
                if(stack.peek() == '('){
                    return true;
                }
                while(stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/' ){
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println(Repeated(s));
        s = "(a+(b)/c)";
        System.out.println(Repeated(s));
        s = "(a+b/c)";
        System.out.println(Repeated(s));
    }import java.util.Stack;

    public class p18_repeated {
        public static boolean Repeated(String st) {
            Stack<Character> stack = new Stack<>();
            for (char c : st.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    stack.push(c);
                } else if (c == ')') {
                    if(stack.peek() == '('){
                        return true;
                    }
                    while(stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/' ){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            String s = "((a+b))";
            System.out.println(Repeated(s));
            s = "(a+(b)/c)";
            System.out.println(Repeated(s));
            s = "(a+b/c)";
            System.out.println(Repeated(s));
        }
    }
    
}
 {
    
}
