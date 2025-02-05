public class ls21SmallestFac{
    public static void main(String[] args){
      int n = 7;
      System.out.println(findNum(n));
    }
    public static int findNum(int n){
        if(n == 0) return 0;
        int low = 0 , high = 5 * n;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int zeroes = counttrailingnumber(mid);

            if(zeroes >= n){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int  counttrailingnumber(int x){
      int count = 0 ;
      while ( x >= 5){
        count += x / 5;
        x = x/5;
      }        
      return count;
    }
}