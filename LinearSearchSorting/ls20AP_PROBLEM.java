public class ls20AP_PROBLEM{

/*      x = a + (n-1) * d    
 *    a = 1sr term
 *     d = common difference
 *     n = position of the term
 *      x = number to check
 *     rearrange - n = (x - a)/ d + 1
 *  
 *       For X to be in the AP:
(X−a) must be divisible by 𝑑
n must be a positive integer.
*/

public static void main(String []args){
    System.out.println(AP(1 , 3 , 2));
}
 public static int AP(int a , int b , int c){
    if(c == 0){
        return (a == b) ? 1 : 0;
    }
    
      if((b - a) % c == 0  && (b - a) / c >= 0){
         return 1;
      }else{
        return 0;
}
 }
}
