
public class s6RunLengthEncoding {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(RunLengthEncoding(n));
    }

    public static String RunLengthEncoding(int n){
      if(n == 1){
        return "1";
      }
      String countSay  = "1";
         
         for(int i = 2 ; i <= n ; i++){
          countSay = getNextSequence(countSay);
         }
     
         return countSay;

        }



        private static String getNextSequence(String s){
          StringBuilder sb = new StringBuilder();
          int count = 1;
          
            for (int j = 1 ; j < s.length() ; j++){
              if(s.charAt(j) == s.charAt(j-1)){
                count++;
              }else{
                sb.append(count).append(s.charAt(j-1));
                count = 1;
              }
             
            }
            sb.append(count).append(s.charAt(s.length() -1));
            return sb.toString();
         } 
    }

