import java.util.ArrayList;

public class s35RecursivelyPrint {
    public static void main(String[] args) {
        String s[][] = { { "you", "we" },
                         { "have", "are" },
                         { "sleep", "eat", "drink" } };


       System.out.println(Recursively(s));                  
    }

    public static ArrayList<ArrayList<String>>  Recursively(String[][] s) {

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> currentSen = new ArrayList<>();
        sentence(s , 0 , currentSen , result);
        return result;
    }

    private static void sentence(String[][] s , int index , ArrayList<String> currentSen , ArrayList<ArrayList<String>> result){
        if(index == s.length){
            result.add(new ArrayList<>(currentSen));
            return;
        }

        for(String w : s[index]){
            currentSen.add(w);
            sentence(s, index + 1, currentSen, result);
            currentSen.remove(currentSen.size() - 1);
        }
    }

}
