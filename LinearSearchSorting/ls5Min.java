public class ls5Min {
    public static int middle(int a , int b , int c){
        int ans = a + b + c - Math.max(a , Math.max(b , c)) - Math.min(a , Math.min(b , c));
        return ans;
    }
/*
    int Middle(int a, int b, int c) {
        // code here
        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c ;
        Arrays.sort(arr);
       
       return arr[1];
    }
*/
    public static void main(String [] args){
        System.out.println(middle(978, 518, 300)); // Output: 518
        System.out.println(middle(162, 934, 200)); // Output: 200
        System.out.println(middle(246, 214, 450)); // Output: 246
    }
}