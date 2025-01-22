public class ls4Square{
    //my solution
   public static int countSquares(int n) {
        // code here
        
        int i = 1 ;
        int count = 0;
       
        while(i * i < n){
            i++;
            count++;
        }
        
        return count;
    }


    // We need to count all such 𝑥 where x2 < n;
    // This means 𝑥 < square root of n 
public static int countsquares(int n) {
    // Find the largest integer x such that x^2 < n
    return (int) Math.sqrt(n - 1);
}

    public static void main(String[] args){
        int n = 9;
        System.out.println(countSquares(n));
        n = 3;
        System.out.println(countSquares(n));
        
        System.out.println();

        System.out.println(countsquares(9));  // Output: 2
        System.out.println(countsquares(3));  // Output: 1
        System.out.println(countsquares(5));  // Output: 2
    }
}