public class s20BinaryCount {
    public static void main(String[] args) {
        String g = "0001010111";
        System.out.println(BinaryCount(g));
        String s = "001";
        System.out.println(BinaryCount(s));
    }

    public static int BinaryCount(String s){
        int countP1 = 0 ; //for pattern 01010101....
        int countP2 = 0;   // for pattern 10101010...
        for(int i = 0 ; i < s.length() ; i++){
            
            char p1 = (i % 2 == 0 ) ? '0' : '1';
            char p2 = (i % 2 == 0 ) ? '1' : '0';

            if(s.charAt(i) != p1){
                countP1++;
            }

            if(s.charAt(i) != p2){
                countP2++;
            }
           
        }
        return Math.min(countP1, countP2);  
    }
  
}
