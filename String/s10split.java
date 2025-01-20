public class s10split {
   public static void main(String[] args) {
    String s = "0100110101";
    System.out.println(Split(s));
    System.out.println("my solution " + split(s));
    String s1 = "001110010";
    System.out.println(Split(s1));
    System.out.println("my solution " + split(s1));
    String s2 = "0000000000";
    System.out.println(Split(s2));
    System.out.println("my solution " + split(s2));
    
   }
   

   // solution
   public static int split(String str){
    int count = 0;
    int zero = 0 ;
    int one = 0;
    for(int i = 0 ; i < str.length() ; i++ ){
        
        if(str.charAt(i) == '0'){
            zero++;
        }
        else{
            one++;
        }

        if(zero == one){
            count++;
            // zero=0;
            // one=0;
        }
    }
     if (zero != one && count == 0)
    {
        return -1;
    }
    return count;
    }







// geeks solution
public static int Split(String str) {
   
        //Write your code here
        int count0 = 0, count1 = 0;
        int n = str.length();
     // To store the count of maximum
     // substrings str can be divided into
     int cnt = 0;
     for (int i = 0; i < n; i++)
     {
         if (str.charAt(i) == '0')
         {
             count0++;
         }
         else
         {
             count1++;
         }
         if (count0 == count1)
         {
             cnt++;
         }
     }
  
     // It is not possible to
     // split the string
     if (count0 != count1)
     {
         return -1;
     }
     return cnt;
     }
}
