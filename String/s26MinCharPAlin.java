public class s26MinCharPAlin {

    /* Given a string s, determine the minimum number of characters that need to be added to the front of the string so that the entire string becomes a palindrome. */
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(minChar(s));
        String s1 = "aacecaaaa";
        System.out.println(minChar(s1));
        String s2 = "abcd";
        System.out.println(minChar(s2));
    }

    public static int minChar(String s) {
        
        String rever = new StringBuilder(s).reverse().toString();
        String temp = s + '#' + rever;
        int lps[] = buildLps(temp);
        return s.length() - lps[temp.length() - 1];
       
    }
    
    private static int[] buildLps(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;
        
        while(i < n){
            if(s.charAt(i) == s.charAt(length)) {
                length++ ;
                lps[i] = length;
                i++;
            }else{
                if(length != 0){
                    length = lps[length - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }



    // my solution but not work in some case
    public static int palinromeMincharAdd(String s){
        int start = 0;
        int end = s.length()-1;
        int count = 0;
        if(s.length() == 1){
            return 0;
        }
        for(int i = 0 ; i < s.length() ; i++){
         
            if(start == end){
                return count;
            }
            if(s.charAt(end) != s.charAt(start)){
                count++;
                end--;
            }else{
              start++;
              end--;
            }
        }
        return count;
    }
}
