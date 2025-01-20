import java.util.ArrayList;

public class s8SubSequence {
    public static void main(String[] args) {
        String s = "hope";
        SubSequence(s, "");
    }

    public static void SubSequence(String s, String current) {

        if (s.length() == 0) {
            System.out.println(current);
            return; 
        }


        SubSequence(s.substring(1), current);
        SubSequence(s.substring(1) , current + s.charAt(0));
    }
}

/*
                                   ""
                          /                \
                         "h"               ""
                     /        \         /       \
                   "ho"       "h"     "o"       ""
                 /     \     /   \   /   \     /   \
              "hop"   "ho" "hp" "h" "op" "o"  "p"  ""
            /    \   /   \ /  \ / \ /  \ / \ /  \ /  \
        "hope" "hop" "hoe" "ho" "ope" "op" "pe" "p" "e" ""

 */
