    
import java.util.Stack;

public class l7 {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "()[]{}";
        String input2 = "(]";
        String input3 = "{[()]}";

        System.out.println("Input: " + input1 + " → " + isValid(input1)); // true
        System.out.println("Input: " + input2 + " → " + isValid(input2)); // false
        System.out.println("Input: " + input3 + " → " + isValid(input3)); // true
    }
}

