public class p13_sell {
   public static void main(String[] args) {
      // int[] prices = { 7, 1, 5, 3, 6, 4 };
      int []prices = {7,6,4,3,1};
      // int []prices = {1 , 3 , 2 , 7 , 5 , 8 };
      System.out.println(sell(prices));
   }

   public static int sell(int[] arr) {
      if(arr == null && arr.length <= 1){
         return 0;
      }

      int minPrice = arr[0];
      int maxPrice = 0 ;

      for ( int i = 1 ; i < arr.length ; i++ ) {
         if(arr[i] < minPrice) {
            minPrice = arr[i];
         }

           // Calculate profit if we sold at current price
         int profit = arr[i] - minPrice;

          // Update the maximum profit
          if(profit > maxPrice) {
            maxPrice = profit;
          }
      }  
      return maxPrice;
   }  
}
