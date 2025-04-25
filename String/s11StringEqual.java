import java.util.HashMap;

public class s11StringEqual {
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";
        System.out.println(StringE(s1, s2));

        String s3 = "abc";
        String s4 = "def";
        System.out.println(StringE(s3, s4));

        String s5 = "gfg";
        String s6 = "gfg";
        System.out.println(StringE(s5, s6));

        String s7 = "deepest", s8 = "depth";
        System.out.println(StringE(s7, s8));

        String p = "mdl";
        String p1 = "qhszmmbgi";
        System.out.println(StringE(p, p1));
    }

    public static int StringE(String s1, String s2) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            h1.put(s1.charAt(i), h1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int j = 0; j < s2.length(); j++) {
            h2.put(s2.charAt(j), h2.getOrDefault(s2.charAt(j), 0) + 1);
        }
        System.out.println(h1);
        System.out.println(h2);

        int count = 0;
        int size = Math.abs(h1.size() - h2.size());
        count += size;
        for (Character key : h1.keySet()) {
            if (!h2.containsKey(key)) {
                count++;
            } else if (!h1.get(key).equals(h2.get(key))) {
                int diff = h1.getOrDefault(key, 0) - h2.getOrDefault(key, 0);
                count += diff;
            }

            // || h1.containsKey(s1.charAt(k)) != h2.containsKey(s2.charAt(k)) ||
            // h1.get(s1.charAt(k)) != h2.get(s2.charAt(k))
        }
        return count++;
    }
}
