public class s7PallindromeLarge {
    public static void main(String[] args) {
        String s  = "aaaabbaa";
          System.out.println(PalinLarge(s));
    }

    public static String PalinLarge(String s){
        
        if(s == null || s.length() == 0){
            return "";
        }

    String p = "";

    

    for( int i = 0 ; i < s.length() ; i++ ){
        String odd = expandAroundCenter(s, i, i);
        if(odd.length() > p.length()){
            p  = odd;
        }

        String even = expandAroundCenter( s , i , i + 1) ;
        if(even.length() > p.length()){
            p = even;
        }

    }
    return p;
        
    }

    private static String expandAroundCenter(String s , int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
