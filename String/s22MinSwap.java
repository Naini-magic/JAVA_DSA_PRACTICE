public class s22MinSwap {
    public static void main(String[] args) {
        String s =  "[]][][";
        System.out.println(MinSwap(s));

        String s1 = "c";
        System.out.println(MinSwap(s1));

    }

    public static int MinSwap2(String s){
        int n = s.length();
    
        // Odd length cannot be balanced
    
    
        int open = 0, close = 0;
    
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                open++;
            } else if(ch == ']'){
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }else{
                return 0;
            }
        }
    
        // Calculate reversals, rounding up
        int reversals = (open + 1) / 2 + (close + 1) / 2;
        return reversals;
    }


    public static int MinSwap(String S) {
        int swaps = 0;    // To keep track of the minimum swaps required
        int balance = 0;  // To maintain the current balance of brackets
        int unbalanced = 0; // To count unbalanced `]` brackets

        // Traverse through the string
        for (char c : S.toCharArray()) {
            if (c == '[') {
                // Opening bracket, increase balance
                balance++;
            } else if(c == ']'){
                // Closing bracket, decrease balance
                balance--;
                // If balance goes negative, we have more `]` than `[`
                // This means there is an imbalance, and we need to swap
                if (balance < 0) {
                    // Increment the swap count and reset the balance to fix the imbalance
                    swaps++;
                    balance = 1; // Reset balance after swapping
                }
            }else{
                return 0;
            }
        }
        int r = (balance + 1)/2 ;
        return swaps + r;
    }
}
