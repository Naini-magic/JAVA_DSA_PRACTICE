import java.util.HashMap;

public class s27Isomorphic {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(Isomorphic(s1, s2));
        String s3 = "aab";
        String s4 = "xyz";
        System.out.println(Isomorphic(s3, s4));
    }

    public static boolean Isomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (h1.containsKey(ch1)) {
                if (h1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                h1.put(ch1, ch2);
            }

            if (h2.containsKey(ch2)) {
                if (h2.get(ch2) != ch1) {
                    return false;
                }
            } else {
                h2.put(ch2, ch1);
            }

        }

        return true;
    }

    public static boolean Isomorphic2(String s1, String s2) {
        // If lengths are different, they can't be isomorphic
        if (s1.length() != s2.length()) {
            return false;
        }

        // Hash maps to track character mappings
        HashMap<Character, Character> mapS1ToS2 = new HashMap<>();
        HashMap<Character, Character> mapS2ToS1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check mapping from s1 to s2
            if (mapS1ToS2.containsKey(ch1)) {
                if (mapS1ToS2.get(ch1) != ch2) {
                    return false; // Mismatch in mapping
                }
            } else {
                mapS1ToS2.put(ch1, ch2);
            }

            // Check mapping from s2 to s1
            if (mapS2ToS1.containsKey(ch2)) {
                if (mapS2ToS1.get(ch2) != ch1) {
                    return false; // Mismatch in mapping
                }
            } else {
                mapS2ToS1.put(ch2, ch1);
            }
        }

        return true; // Strings are isomorphic
    }
}
