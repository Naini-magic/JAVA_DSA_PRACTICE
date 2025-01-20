import java.util.HashMap;

public class s29SmallestWindow {
    public static void main(String[] args) {
        String s1 = "timetopractice", s2 = "toc";
        System.out.println(SmallestWindow(s1, s2));

        s1 = "zoomlazapzo";
        s2 = "oza";
        System.out.println(SmallestWindow(s1, s2)); // Output: "apzo"

        s1 = "zoom";
        s2 = "zooe";
        System.out.println(SmallestWindow(s1, s2)); // Output: "-1"
    }
    public static String SmallestWindow(String s1 , String s2){
        if (s1.length() < s2.length()) {
            return "-1";
        }
        HashMap<Character , Integer> h = new HashMap<>();
        for(int i = 0 ; i < s2.length() ; i++){
          h.put(s2.charAt(i), h.getOrDefault(s2.charAt(i), 0)+1);
        }
        
        // Check if s1 contains all required characters of s2
        HashMap<Character, Integer> s1CharCount = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1CharCount.put(ch, s1CharCount.getOrDefault(ch, 0) + 1);
        }
        for (char ch : h.keySet()) {
            if (s1CharCount.getOrDefault(ch, 0) < h.get(ch)) {
                return ""; // s1 does not contain all characters required by s2
            }
        }

        int left = 0 , right = 0 ;
        int minlength = Integer.MAX_VALUE;
        int minStart = 0;
        int count = 0;
        // expand the window
        for(right = 0 ; right < s1.length() ; right++){
            char ch = s1.charAt(right);
            if(h.containsKey(ch)){
                h.put(ch, h.get(ch) - 1);
                if(h.get(ch) >= 0){ // vaild string match
                    count++;
                }
            }


            // shrink the window
            while (count == s2.length()) {
                if(right - left + 1 < minlength){
                    minlength = right - left + 1;
                    minStart = left ;
                }
            

            char leftchar = s1.charAt(left);
            if(h.containsKey(leftchar)) {
                h.put(leftchar, h.get(leftchar) + 1);
                if (h.get(leftchar) > 0) {     // A required character is removed
                    count--;
                }
            }
            left++ ;
        }}
        return minlength == Integer.MAX_VALUE ? "-1" : s1.substring(minStart, minStart + minlength);


    }
}
