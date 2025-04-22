
import java.util.Arrays;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arr");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int i = 0 ; 
        int k = 0;
        while(i < arr.length){
            System.out.println("enter num : ");
            int num = sc.nextInt();
            if(num == 0){
                count++;
            }else{
                arr[k] = num;
                k++;
            }
            i++;
        }
        while (count > 0) {
            arr[k] = 0;
            k++;
            count--;
        }

        System.out.println(Arrays.toString(arr));
    }
}