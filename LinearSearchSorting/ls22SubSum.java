public class ls22SubSum{
   public static int subSum(int arr[] , int a , int b){
   int count = 0;
   for(int i = 0 ; i < arr.length-1 ; i++){
      count++;
      int sum = 0;
      for(int j = i + 1 ; j < arr.length ; j++){
         sum = arr[i] + arr[j];
         if(sum <= b && sum >= a){
            count++;
         }
      }
   }
   }
   public static void main(){
    int arr[] = {3 , 1 , -2 ,3};
    int a = -1;
    int b = 3 ;
   }
}