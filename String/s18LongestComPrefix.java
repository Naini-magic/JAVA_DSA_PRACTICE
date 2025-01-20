public class s18LongestComPrefix {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(Long(strs));
        String strs1[] = { "flower", "fow", "flight" };
        System.out.println(Long(strs1));
    }

    public static String Long(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            // Check if the current string contains the prefix at the beginning
            while (str[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix is empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
