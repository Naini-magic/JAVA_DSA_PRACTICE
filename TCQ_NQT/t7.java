import java.util.Scanner;

public class t7 {
    private static final String[] BELOW_20 = {
            "zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };
    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String numtoWord(int num) {
        if (num < 20) {
            return BELOW_20[num];
        }

        StringBuilder sb = new StringBuilder();
        if (num >= 1000) {
            sb.append(BELOW_20[num / 1000]).append(" thousand ");
            num %= 1000;
        }
        if (num >= 100) {
            sb.append(BELOW_20[num / 100]).append(" hundred ");
            num %= 100;
        }
        if (num >= 20) {
            sb.append(TENS[num / 10]);
            if (num % 10 != 0) {
                sb.append(" ").append(BELOW_20[num % 10]);
            }
        } else if (num > 0) {
            if (sb.length() > 0)
                sb.append(" ");
            sb.append(BELOW_20[num]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            System.out.println(numtoWord(N));
        }
        in.close();
    }
}
