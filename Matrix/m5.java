
public class m5 {

    //tc - O(M+N)
    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
    
        int maxRow = -1;
        int col = m - 1;
    
        for (int row = 0; row < n; row++) {
            while (col >= 0 && arr[row][col] == 1) {
                maxRow = row;
                col--;  // move left to find more 1s
            }
        }
    
        return maxRow;
    }
    
    // tc - O(n*m)
    public static int rowWithMax1s2(int arr[][]) {
        // code here
        int max = 0;
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++ ){
            int count = 0;
            for(int j = 0 ; j < arr[i].length ; j++ ) {
                if(arr[i][j] == 1){
                    count++;
                }
            } 
           
                if(count > max){
                    max = count;
                    ans = i;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,1} , {0,0,1,1} , {1,1,1,1} , {0,0,0,0}};
        System.out.println(rowWithMax1s(arr));
    }
}
