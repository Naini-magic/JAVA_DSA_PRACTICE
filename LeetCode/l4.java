public class l4 {
    
    public static boolean isPalindrome(String s) {
        
        
        if(s.length()==0){
            return true;
        }
        int i= 0;
        int j= s.length()-1;
           while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {

                i++;
            }

            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
           else if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else{
            return false;
            }
            
           }
           return true;
       

        
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }
}

