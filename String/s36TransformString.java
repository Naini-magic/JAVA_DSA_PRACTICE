public class s36TransformString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bac";
        System.out.println(TansformString(s1, s2));
        String A = "GeeksForGeeks", B = "ForGeeksGeeks";
        System.out.println(TansformString(A, B));
    }

    public static int TansformString(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m != n) {
            return -1;
        }

        // Step 2: Verify that both strings contain the same characters
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII)
        for (int i = 0; i < m; i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        // Check if any character has unmatched frequency
        for (int count : freq) {
            if (count != 0) {
                return -1;
            }
        }

        int count = 0;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i--;
                j--;
            } else {
                count++;
                i--;
            }
        }
        return count;
    }
}