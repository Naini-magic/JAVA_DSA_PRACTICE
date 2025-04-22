public class m3{

    // TC - O(m*n)
    public static boolean searchMatrix(int[][] arr, int target) {
        for(int i = 0 ; i < arr.length ; i++ ){
        if (arr[i][arr[i].length - 1] >= target) {
               for(int j = 0 ; j < arr[i].length ; j++){
                  if(arr[i][j] == target){
                    return true;
                  }
               }
               return false;
            }
        }
        return false;
    }

    // TC - O(log(m*n))

    public static boolean byBinarySearch(int arr[][] , int target){
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = m * n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            int midIndex = arr[mid / n][mid % n];
            if(midIndex == target){
                return true;
            }else if (midIndex < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}};
        System.out.println(searchMatrix(arr , 3));
        System.out.println(byBinarySearch(arr , 3));
    }
}