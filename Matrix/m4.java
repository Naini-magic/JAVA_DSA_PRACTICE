public class m4 {
    /*✅ Step-by-step summary:
Choose mid of current range ((min + max)/2)

Count how many elements ≤ mid using binary search in each row

If the count is less than the desired median position, shift the min to mid + 1

Else, shift max to mid

When min == max, you've found the median

 */
    public static int findMedian(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        for(int i = 0 ; i < r ; i++ ){
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c-1]);
        }

        int desired = (r * c + 1) / 2;

        while( min < max ){
            int mid = min + (max - min)/2 ;
            int count = 0;

            for( int i = 0 ; i < r ; i++ ){
                count += countLessEqual(matrix[i] , mid);
            }
            if( count < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    public static int countLessEqual(int row[] , int target){
        int low = 0 , high = row.length;
        while(low < high){
         int mid = (low + high) / 2;
         if( row[mid] <= target ) {
            low = mid + 1;
         } else {
            high = mid;
         }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println("Median is: " + findMedian(mat1)); // Output: 5

        int[][] mat2 = {{1}, {2}, {3}};
        System.out.println("Median is: " + findMedian(mat2)); // Output: 2

        int[][] mat3 = {{3}, {5}, {8}};
        System.out.println("Median is: " + findMedian(mat3)); // Output: 5
    }
}
