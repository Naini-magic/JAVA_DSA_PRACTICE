import java.util.ArrayList;
import java.util.List;

public class s9Permutation {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> result = new ArrayList<>();
        Permutation(s , "" , result);
        System.out.println(result);
    }

    public static void Permutation(String s , String current , List<String> result){

       if(s.length() == 0){
        result.add(current);
        return;
       }

       for( int i = 0 ; i < s.length() ; i++ ) {
        char ch = s.charAt(i);

        String remaining = s.substring(0, i) + s.substring(i + 1);
        Permutation(remaining, current+ch, result);
       }

    }
}


/*
                                   ("ABC", "")
                          /            |            \
                  ("BC", "A")   ("AC", "B")   ("AB", "C")
                    /     \        /     \        /     \
         ("C", "AB") ("B", "AC") ("C", "BA") ("A", "CB") ("B", "CA")
           /               |             |              |          \
     ("", "ABC")  ("", "ACB")  ("", "BAC")  ("", "BCA")  ("", "CAB")  ("", "CBA")

 */
