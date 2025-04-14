import java.util.HashSet;
import java.util.Scanner;

public class t4 {
    public static int sumOfOccurrences(String str1 , String str2){
        HashSet<Character> unique = new HashSet<>();
        int count = 0;
        for(char ch : str2.toCharArray()){
            if(!unique.contains(ch)){
                unique.add(ch);
            }
        }
        
        for(char ch : str1.toCharArray()){
            if(unique.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine(); 

        while (t-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(sumOfOccurrences(str1, str2)); 
        }

        scanner.close();
    }
}
