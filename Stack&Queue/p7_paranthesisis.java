import java.util.Stack;

public class p7_paranthesisis {
    public static boolean parenthesis(String s){
      Stack<Character> p = new Stack<>();
        
      for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        // System.out.println(ch);

        if(ch == '(' || ch == '[' || ch == '{'){
            p.push(ch);
        }else {
            if(p.isEmpty()) return false;
            char top = p.pop();
            if((ch == ')' && top != '(') ||
            (ch == '}' && top != '{') ||
            (ch == ']' && top != '[')) {
            return false;
        }
    }
      }
      return p.isEmpty();

    }
    public static void main(String[] args) {
       System.out.println(parenthesis("[()]{}]")); 
    }
}
