import java.util.Arrays;

public class s2Palindrome {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }

    public static  boolean isPalindrome(String s) {
        int left = 0 ; 
        int right = s.length()-1;

        while (left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    // use extra space
  public static  boolean isPalindrome2(String s) {
        // code here
        char st[] = s.toCharArray();
        int left = 0;
        int right = st.length-1;
        while(left < right){
            char temp = st[left];
            st[left] = st[right];
            st[right] = temp;
            left++;
            right--;
            
        }
        System.out.println(Arrays.toString(st));
        String h = new String(st);
        System.out.println(h);
        return s.equals(h);
    }
}
