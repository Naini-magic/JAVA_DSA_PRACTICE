import java.util.HashMap;
import java.util.HashSet;

public class s25SmallestWindow {
    public static void main(String[] args) {
        String s = "AABBBCBBAC" ;
        SmallestDistinctWindow(s);
    }

    public static void SmallestDistinctWindow(String s){
        HashSet<Character> h = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            h.add(s.charAt(i));
        }
    int reqcount = h.size();

    HashMap<Character , Integer> charCount = new HashMap<>();
     int minLength = Integer.MAX_VALUE;
     int start = 0 , matchCount = 0 ;
    
    for(int end = 0 ; end < s.length(); end++ ){
        char endChar = s.charAt(end);
        charCount.put(endChar, charCount.getOrDefault(endChar, 0) + 1);

        if(h.containsKey(endChar) &&)
    }

}

}
