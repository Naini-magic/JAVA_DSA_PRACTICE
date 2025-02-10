public class ls30_double_helix{
    public static void main(String []args){
        int arr[] = {3 , 5 , 7 , 9 , 20 , 25 , 30 , 40 , 55 , 56 , 57 , 60 , 62};
        int arr1[] = {1 , 4 , 7 , 11 , 14 , 25 , 44 , 47 , 55 ,57 , 100};
        System.out.println(doubleHelix(arr , arr1));
    }

    public static int doubleHelix(int arr1[] , int arr2[]){
        int ans = 0 ;
        int sum1 = 0;
        int sum2 = 0;

        int i = 0 ;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                sum1 += arr1[i];
                i++;
            }else if(arr2[j] < arr1[i]){
                sum2 += arr2[j];
                j++;
            }else{

                ans += Math.max(sum1, sum2) + arr1[i]; // Add common element
                sum1 = sum2 = 0;
                i++; j++;
            }
        }



          // Add remaining elements
          while (i < arr1.length) sum1 += arr1[i++];
          while (j < arr2.length) sum2 += arr2[j++];
  
          // Final max sum calculation
          ans += Math.max(sum1, sum2);

        return ans;
    }
}