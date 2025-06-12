import java.util.HashMap;

public class s3Dupilicate {
    public static void main(String[] args) {
        String S = "geeksforgeek" ;
        duli(S);
        // String str = "geeksforgeeks";
    }


    public static void duli(String s){
            HashMap<Character , Integer> Count = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++ ) {
        
        Count.put(s.charAt(i), Count.getOrDefault(s.charAt(i), 0)+ 1);
    }
      
    Count.forEach((key, value) -> {
        if(value > 1){
        System.out.println(key + " = " + value);
        }
    });


    // other way to print same things
        for (char key : Count.keySet()) {
            if (Count.get(key) > 1) {
                System.out.println(key + ", count = " + Count.get(key));
            }
    }

}}
