import java.util.Stack;

public class ExpressionConverter {

    // Method to return precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3; // Exponentiation has the highest precedence
            default: return -1;
        }
    }

    // Infix to Postfix Conversion
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    // Infix to Prefix Conversion
    public static String infixToPrefix(String expression) {
        StringBuilder reversedExpr = new StringBuilder(expression).reverse();
        for (int i = 0; i < reversedExpr.length(); i++) {
            if (reversedExpr.charAt(i) == '(') {
                reversedExpr.setCharAt(i, ')');
            } else if (reversedExpr.charAt(i) == ')') {
                reversedExpr.setCharAt(i, '(');
            }
        }
        String postfix = infixToPostfix(reversedExpr.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    // Postfix to Infix Conversion
    public static String postfixToInfix(String expression) {
        Stack<String> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push("(" + a + c + b + ")");
            }
        }
        return stack.pop();
    }

    // Prefix to Infix Conversion
    public static String prefixToInfix(String expression) {
        Stack<String> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push("(" + a + c + b + ")");
            }
        }
        return stack.pop();
    }

    // Postfix to Prefix Conversion
    public static String postfixToPrefix(String expression) {
        Stack<String> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push(c + a + b);
            }
        }
        return stack.pop();
    }

    // Prefix to Postfix Conversion
    public static String prefixToPostfix(String expression) {
        Stack<String> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(a + b + c);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "(a+b)*f";

        System.out.println("Infix Expression: " + infix);
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: " + postfix);

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);

        System.out.println("Postfix to Infix: " + postfixToInfix(postfix));
        System.out.println("Prefix to Infix: " + prefixToInfix(prefix));
        System.out.println("Postfix to Prefix: " + postfixToPrefix(postfix));
        System.out.println("Prefix to Postfix: " + prefixToPostfix(prefix));
    }
}
