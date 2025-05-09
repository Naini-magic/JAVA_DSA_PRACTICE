import java.util.Scanner;
import java.util.Stack;



/*Problem Statement
David finds some strings containing only ‘)’ and ‘(‘ parentheses. He is keen to find the length of largest substring that formed the valid bracket sequence. But he does not know how to do it, so help him to find the length of largest valid bracket substring in the given string.

Input Format
The first line contains an integer n – the size of the string.
The second line contains the ‘n’ character of the string.
Output Format
Print a single integer - the length of the largest valid substring
Constraints
0 <= n <= 10000.
String contains only ‘(‘ and ‘)’.
Sample Testcase 0
Testcase Input
3
(()
Testcase Output
2
Explanation
2 is the largest valid substring the given string.
Sample Testcase 1
Testcase Input
6
)()())
Testcase Output
4
Explanation
()() is the largest valid substring which has of length 4. */

public class t16 {
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();
     String st = sc.nextLine();

     int maxS = 0;
     int curr = 0;
     Stack<Character> stk = new Stack<>();
     for(char ch : st.toCharArray()){
        if(ch == '('){
            stk.push(ch);
            System.out.println(stk);
        }else{
            if(stk.isEmpty()){
                maxS = Math.max(maxS , curr);
                curr = 0;
            }else{
                stk.pop();
                curr +=2 ;
            }
        }
     }
     System.out.println( Math.max(maxS , curr));

    }
}



