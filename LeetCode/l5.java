import java.util.Arrays;
import java.util.Collections;

public class l5 {
        public static void main(String[] args) {
        // Test input
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        // Calling the method
        System.out.println("Output 1: " + reverseWords(s1)); // blue is sky the
        System.out.println("Output 2: " + reverseWords(s2)); // world hello
        System.out.println("Output 3: " + reverseWords(s3)); // example good a
    }

    public static String reverseWords(String s) {
        // Step 1: Remove leading/trailing spaces
        s = s.trim();

        // Step 2: Split words by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Reverse the words array
        Collections.reverse(Arrays.asList(words));

        // Step 4: Join words with single space
        return String.join(" ", words);
    }
}


