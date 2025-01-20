import java.util.HashMap;

public class s13NumKeypad {
    public static void main(String[] args) {
        String s = "GFG";
        System.out.println(Keypad(s));
        String s1 = "HOPE";
        System.out.println(Keypad(s1));

    }

    public static String Keypad(String s) {
        String[] keypad = {
                "2", "22", "222", // A, B, C
                "3", "33", "333", // D, E, F
                "4", "44", "444", // G, H, I
                "5", "55", "555", // J, K, L
                "6", "66", "666", // M, N, O
                "7", "77", "777", "7777", // P, Q, R, S
                "8", "88", "888", // T, U, V
                "9", "99", "999", "9999" // W, X, Y, Z
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append('0');
            } else {
                int index = ch - 'A';
                result.append(keypad[index]);
            }
        }

        return result.toString();
    } 

    // my way but not correct
    public static String NumKEypad(String s) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("ABC", 2);
        h.put("DEF", 3);
        h.put("GHI", 4);
        h.put("JKL", 5);
        h.put("MNO", 6);
        h.put("PQRS", 7);
        h.put("TUV", 8);
        h.put("WXYZ", 9);
        h.put(" ", 0);

        String r = "";
        int i = 0;
        while (i < s.length()) {

            for (String key : h.keySet()) {
                String sub = Character.toString(s.charAt(i));
                if (key.contains(sub)) {
                    int in = key.indexOf(sub) + 1;
                    i++;
                    r = sub.repeat(in);
                }

            }
        }
        return r;
    }
}
