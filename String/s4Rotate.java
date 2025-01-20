public class s4Rotate {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(rotate(s1, s2));
    }

    public static boolean rotate(String s1 , String s2) {
       if(s1.length() != s2.length()){
        return false;
       }

       String concatenated = s1 + s1 ;
       return concatenated.contains(s2);
    }




    // other method to do it 
    public static boolean areRotations(String s1, String s2) {
        // Check if both strings have the same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Rotate s1 step by step and check if it matches s2
        for (int i = 0; i < s1.length(); i++) {
            s1 = rotateLeft(s1);
            if (s1.equals(s2)) {
                return true;
            }
        }

        // If no rotation matches, return false
        return false;
    }

    // Rotate the string left by 1 position
    private static String rotateLeft(String s) {
        return s.substring(1) + s.charAt(0);
    }




    // another method 
    static boolean areRotations2(String s1, String s2) {
        int n = s1.length();

        // Generate and check all possible rotations of s1
        for (int i = 0; i < n; ++i) {
            
            // If current rotation is equal to s2, return true
            if (s1.equals(s2)) {
                return true;
            }

            // Right rotate s1
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;
    }
}
