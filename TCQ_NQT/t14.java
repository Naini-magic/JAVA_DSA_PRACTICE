/*Problem Statement
Alice challenged Bob to write the same word as his on a typewriter. Both are kids and are making some mistakes in typing and are making use of the ‘#’ key on a typewriter to delete the last character printed on it.

An empty text remains empty even after backspaces. 

Input Format
The first line contains a string typed by Bob.

The second line contains a string typed by Alice.

Output Format
The first line contains ‘YES’ if Alice is able to print the exact words as Bob , otherwise ‘NO’.

Constraints
1 <= Bob.length

Alice.length <= 100000

Bob and Alice only contain lowercase letters and '#' characters.

Sample Testcase 0
Testcase Input
ab#c
ad#c
Testcase Output
YES
Explanation
Here ,
The actual typed string by Bob : ‘ac’
The actual typed string by Alice : ‘ac’
Hence , they matched.
Sample Testcase 1
Testcase Input
a#c
b
Testcase Output
NO
Explanation
Here ,
The actual typed string by Bob : ‘c’
The actual typed string by Alice : ‘b’
Hence , they do not matched. */

import java.util.Scanner;

public class t14 {
     public static boolean userLogic(String bob, String alice) {
        // user logic goes here
      return process(bob).equals(process(alice));
      
    }

    public static String process(String str){
        StringBuilder sb = new StringBuilder();

         for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(ch);
            }
         }

         return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bob = sc.nextLine();   //ab#c
        String alice = sc.nextLine(); // ad#c
        boolean result = userLogic(bob, alice);
        System.out.println(result ? "YES" : "NO");
    }
}
