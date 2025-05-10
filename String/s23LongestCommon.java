import java.util.Arrays;

public class s23LongestCommon {
    // this solution is giving wrong ans
    // the right code will be solved by DP
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println(SubsequenceCommon(s1, s2));
        String s3 = "ABC", s4 = "AC";
        System.out.println(SubsequenceCommon(s3, s4));

        String s5 = "XYZW", s6 = "XYWZ";
        System.out.println(SubsequenceCommon(s5, s6));
    }

    public static int SubsequenceCommon(String s1, String s2) {
        int subsequence = 0;
        for (int i = 0; i < s1.length(); i++) {
            String cur = Character.toString(s1.charAt(i));
            if (s2.contains(cur)) {
                subsequence++;
            }
        }

        return subsequence;
    }

}
