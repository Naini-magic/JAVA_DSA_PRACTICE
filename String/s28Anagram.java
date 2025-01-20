import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class s28Anagram {
    public static void main(String[] args) {
        String arr[] = { "act", "god", "cat", "dog", "tac" };
        System.out.println(Anagram(arr));
    }

    public static ArrayList<ArrayList<String>> Anagram(String[] s) {

        HashMap<String, ArrayList<String>> h = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            

            if(!h.containsKey(sortedString)){
                h.put(sortedString, new ArrayList<>());
            }
            h.get(sortedString).add(str);
        }
        System.out.println(h);

       return new ArrayList<>(h.values());
    }
}
