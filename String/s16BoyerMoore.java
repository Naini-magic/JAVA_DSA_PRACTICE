public class s16BoyerMoore {
    public static void main(String[] args) {
        String s = "AABAACAADAABAABA";
        String p = "BAABA";
        kmpPattern(p, s);

        String s1 = "THIS IS A TEST TEXT";
        String p1 = "TEST";
        kmpPattern(p1, s1);
    }


    /*The algorithm implemented in your code is not the Boyer-Moore algorithm — despite the class name s16BoyerMoore.
Instead, it implements the Knuth-Morris-Pratt (KMP) algorithm for pattern matching in strings. */

    public static void kmpPattern(String pattern , String string){
         int lp = pattern.length();
         int ls = string.length();

         int table[] = new int[lp];
         int j = 0 ;
         prefixTable(pattern , lp , table);
         int i = 0 ;
         while (i < ls) {
            if(pattern.charAt(j) == string.charAt(i)){
             j++;
             i++;
            } 

            if(j == lp){
                System.out.println("Pattern found - " + (i-j));
                j = table[j - 1];
            }else if(i < ls && pattern.charAt(j) != string.charAt(i)){
                 if(j != 0){
                    j = table[j - 1];
                 }else{
                    i = i+1;
                 }
            }
         }
    }

    private static void prefixTable(String p , int m , int table[]){
      int j = 0;
      int i = 1;
      table[0] = 0;

      while (i < m) {
        if(p.charAt(i) == p.charAt(j)){
            j++;
            table[i] = j;
            i++ ;
        }else{
            if(j != 0){
                j = table[j - 1];
            }else{
                table[i] = j;
                i++;
            }
        }
      }
    }
}
