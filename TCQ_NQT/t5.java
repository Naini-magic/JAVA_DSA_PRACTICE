import java.util.Scanner;

public class t5 {
    public static void isGood(int num){
        int sum = 0;
        int org = num;
        while(num != 0){
            sum += num%10;
            num = num/10;
        }
        if(org%sum == 0){
            System.out.println("Good Number");
        }else{
            System.out.println("Bad Number");
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n--> 0){
            int num = sc.nextInt();
            isGood(num);
        }
    }
}
