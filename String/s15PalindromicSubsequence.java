public class s15PalindromicSubsequence {
    public static void main(String[] args) {
        String s = "abbb";
        String current = "";
        System.out.println(SubSequence(s , current));
    }

    public static int SubSequence(String s, String current) {

              
        if (s.length() == 0) {
            
            if(current.equals(new StringBuilder(current).reverse().toString())){
                return 1 ;
            }
            return 0;
        }

        

       int excludechar = SubSequence(s.substring(1), current);
      int includechar =  SubSequence(s.substring(1) , current + s.charAt(0));

        return excludechar + includechar;
    }

 }
