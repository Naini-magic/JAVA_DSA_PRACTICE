public class p27Palindromic {
    public static void main(String[] args) {
        int arr[] = {121, 131, 20};
        System.out.println(Palindromic(arr));
        int ar [] = { 111, 222, 333, 444, 555 };
        System.out.println(Palindromic(ar));

        System.out.println(ArePalin(arr));
        System.out.println(ArePalin(ar));
    }

    public static boolean Palindromic(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            String num = Integer.toString(arr[i]);
            // System.out.println(num);
            String reverseStr = new StringBuilder(num).reverse().toString();
            // System.out.println(reverseStr);
            if(num.equals(reverseStr) == false){
                return false;
            }
        }
        return true;
    }
   

    public static boolean ArePalin(int arr[]) {
        for(int e : arr) {
            if(!ispalin(e)){
              return false;
            }
        }
        return true;
    }

    public static boolean ispalin(int num){
       
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num /= 10 ;
        }
        return original == reverse;
    }
     
}
