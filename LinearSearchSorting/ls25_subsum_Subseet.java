public class ls25_subsum_Subseet{
    public static void main (String [] args){
        int a = -1 ;
        int b = 2;
        int arr[] = {1 , -2 , 3};
        int n = arr.length;
       System.out.println(Subsum_Sumset( arr ,  n ,  a ,  b));
    }

    public static int Subsum_Sumset(int arr[] , int n , int a , int b){
        int count = 0;
        if(a <= 0 && 0 <= b){
          count++;
        }

        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            if(arr[i] >= a && arr[i] <= b){
                count++;
            }
            int sum = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++){
               sum += arr[j];
               if(sum >= a && sum <= b){
                count++;
               }
             
            }
        }
        if(arr[arr.length - 1] >= a && arr[arr.length - 1] <= b){
            count++;
        }

        return count ;
    }
}