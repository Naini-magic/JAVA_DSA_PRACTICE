
public class s14ReveesalCount {
    public static void main(String[] args) {
    String s = "}{{}}{{{";
    System.out.println(Reversals(s));

    String s2 = "}}}{{}}{{{{{";
    System.out.println(Reversals(s2));

    String s3 = "}}{}{{{}";
    System.out.println(Reversals(s3));

    String s4 = "}}}{";
    System.out.println(Reversals(s4));
    }


    public static int Reversals(String s) {
        int n = s.length();
    
        // Odd length cannot be balanced
        if (n % 2 != 0) {
            return -1;
        }
    
        int open = 0, close = 0;
    
        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
    
        // Calculate reversals, rounding up
        int reversals = (open + 1) / 2 + (close + 1) / 2;
        return reversals;
    }

}
