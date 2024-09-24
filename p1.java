public class p1 {
    public static void main(String[] args) {
        int[] arr1 = {0 , 2 , 1 , 2 , 0};
        System.err.println(sort(arr1));
    }
    static int[] sort(int arr[]){
        int i = 0;
      while(i < arr.length){
        if(arr[i] == arr[i+1]){
            i++;
        }
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }
        else{
            i++;
        }
      }
      return arr;
    }
}
