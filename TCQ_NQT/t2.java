import java.util.Scanner;

public class t2{
        
    //factorial without multipication and divide
    public static int multiply(int k , int j){
        int result = 0;
        for(int i = 0 ; i < j ; i++){
            result += k;
        }
        return result;
    }
    public static int factorial(int a){
        if(a == 1 || a == 0){
            return 1;
        }
        return multiply(a , factorial(a-1));
    }
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            System.out.println(factorial(N));
        }
        sc.close();
    }
}



// without factorial 
/*import java.util.Scanner;

public class FactorialWithoutMulDiv {

    // Function to multiply two numbers using only addition
    static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();

            int result = 1;
            for (int i = 2; i <= N; i++) {
                result = multiply(result, i); // simulate result *= i
            }

            System.out.println(result);
        }

        sc.close();
    }
}
 */