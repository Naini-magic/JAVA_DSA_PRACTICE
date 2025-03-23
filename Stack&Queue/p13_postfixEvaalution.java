import java.util.Stack;
public class p13_postfixEvaalution {
    
        public int evaluate(String[] arr) {
            Stack<Integer> res = new Stack<>();
    
            for (int i = 0; i < arr.length; i++) {
                if (isNumber(arr[i])) {
                    res.push(Integer.parseInt(arr[i]));
                } else {
                    int t1 = res.pop(); // Second operand
                    int t2 = res.pop(); // First operand
                    int result = 0;
    
                    switch (arr[i]) {
                        case "+": result = t2 + t1; break;
                        case "-": result = t2 - t1; break;
                        case "*": result = t2 * t1; break;
                        case "/": result = t2 / t1; break; // Integer division (rounds towards zero)
                    }
    
                    res.push(result); // Push the calculated result
                }
            }
            return res.peek(); // Return final result
        }
    
        private boolean isNumber(String s) {
            return s.matches("-?\\d+"); // Checks if it's a valid integer (supports negatives)
        }
    
        public static void main(String[] args) {
            p13_postfixEvaalution sol = new p13_postfixEvaalution();
    
            String[] expression1 = {"2", "3", "1", "*", "+", "9", "-"};
            System.out.println(sol.evaluate(expression1)); // Output: -4
    
            String[] expression2 = {"100", "200", "+", "2", "/", "5", "*", "7", "+"};
            System.out.println(sol.evaluate(expression2)); // Output: 757
        }
    }
    
