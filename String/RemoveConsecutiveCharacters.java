import java.util.HashMap;
import java.util.PriorityQueue;

public class RemoveConsecutiveCharacters {

    public static void main(String[] args) {
      String s = "aabb";
      System.out.println(removeConsecutiveCharacter(s));
      String s2 = "aaab";
      System.out.println(removeConsecutiveCharacter(s2));
      String s3 = "aaaabbbb";
      System.out.println(removeConsecutiveCharacter(s3));
    }   

    public static String removeConsecutiveCharacter(String S) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            h.put(S.charAt(i), h.getOrDefault(S.charAt(i), 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (char k : h.keySet()) {
            pq.add(new Pair(k, h.get(k)));
        }

        StringBuilder ans = new StringBuilder("");
        Pair temp = new Pair('#', 0);

        while (pq.size() > 0) {
            Pair prev = pq.poll();
            ans.append(prev.ch);
            prev.freq -= 1;
            if (temp.freq > 0) {
                pq.add(temp);
            }
            temp = prev;
        }
        if (ans.length() == S.length()) {
            return ans.toString();
        } else {
            return "-1";
        }
    }

    public static class Pair implements Comparable<Pair> {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Pair p1) {
            return p1.freq - this.freq;
        }
    }
}
