import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class p18Factorials {
    public static int fac(int n){
        
        if(n <= 1){
            return 1;
        }else{
           return n * fac(n-1);
        }

    }

    public static ArrayList<Integer> 
    Large( int n) {

        ArrayList<Integer> list = new ArrayList<>();


        while ( n > 0 ){
            int digit = n % 10 ;  // get last digit 
            list.add(digit);
            n = n / 10;  // remove last digit
        }
          
       
       Collections.reverse(list);
        return list;

    }
    

     public static ArrayList<Integer> factorial(int N) {
        // Initialize the result as BigInteger
        BigInteger result = BigInteger.ONE;

        // Calculate the factorial iteratively
        for (int i = 1; i <= N; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

         // Prepare the list to hold the digits
         ArrayList<Integer> digits = new ArrayList<>();
        
         // Convert the result to a string to extract digits
         String resultStr = result.toString();
 
         // Loop through each character of the string representation
         for (char digit : resultStr.toCharArray()) {
             digits.add(Character.getNumericValue(digit)); // Convert char to int and add to the list
         }
 
         return digits; // Return the list of digits
     }

// Character.getNumericValue(char) is a utility method that converts a character representing a digit (e.g., '1', '2', etc.) into its corresponding integer value.
    public static void main(String[] args) {
        int N = 5;
    //     fac(N);
    //    System.out.println( Large(fac(N))  ) ;

    System.out.println(factorial(N));
    }
}
