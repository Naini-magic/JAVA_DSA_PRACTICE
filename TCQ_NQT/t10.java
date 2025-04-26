import java.util.Scanner;

public class t9 {
    

    public static int fine(int arr[] , int n , int d , int x){
        int f = 0;
        if(d % 2 == 0){
            for(int i = 0 ; i < n ; i++){
                if(arr[i] % 2 != 0){
                    f = f + x;
                }
            }
        }else{
            for(int i = 0 ; i < n ; i++){
                if(arr[i] % 2 == 0){
                    f += x;
                }
            }
        }
        return f;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numver of vehicle");
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i < N ; i++){
            System.out.println("enter the number of " + i);

           arr[i] = sc.nextInt();
        }

        System.out.println("Enter d");
        int d = sc.nextInt();
        System.out.println("Enter X");
        int x = sc.nextInt();

        System.out.println(fine(arr , N , d , x));
    }
}
