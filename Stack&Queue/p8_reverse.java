import java.util.Stack;

public class p8_reverse {
     public static String  reverse(String S){
        //code here
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : S.toCharArray()){
            s.push(ch);
        }
        
        while(!s.isEmpty()){
            char ch = s.pop();
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Sunaini"));
    }
}
