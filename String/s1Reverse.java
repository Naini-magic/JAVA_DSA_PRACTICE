

import java.util.Arrays;

public class s1Reverse {
  public static void main(String[] args) {
    char s[] = {'h' , 'e' , 'l' , 'l' , 'o'};
    reverseString(s);
  }  
  public static void reverseString(char[] s) {
    int left = 0;
    int right = s.length-1;

    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
     System.out.println(Arrays.toString(s));
}


// wrong way
public static void reverseString2(char[] s) {
    char f = s[0];
    for(int i = s.length - 1 , j = 0; i >0  ; i-- , j++){
       s[j] = s[i];
    }
    s[s.length - 1] = f;
    System.out.println(Arrays.toString(s));
}
}


