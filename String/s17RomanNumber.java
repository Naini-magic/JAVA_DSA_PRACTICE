import java.util.HashMap;

public class s17RomanNumber {

    public static void main(String[] args) {
        String s = "VII";
        System.out.println(romanToDecimal(s));
    }

    public static int romanToDecimal(String s) {
        // code here
        HashMap<Character, Integer> h = new HashMap<>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);

        int sum = 0;

        int i = 0;
        while (i < s.length()) {
            int currentValue = h.get(s.charAt(i));
            if (i < s.length() - 1 && currentValue < h.get(s.charAt(i + 1))) {

                sum -= currentValue;
                i++;

            } else {
                sum += currentValue;
                i++;
            }
        }

        return sum;
    }

}
