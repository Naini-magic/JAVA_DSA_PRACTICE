public class p11_CElebrity {
    public static int Celebrity(int [][]mat){
        int n = mat.length;
       int top = 0 , down = n-1;

       while( top < down ){
        if(mat[top][down] == 1){
            top++ ;
        }else{
            down-- ;
        }
    }

        
        int candidate = top;
        for( int i = 0 ; i < n ; i++){
            if(i != candidate){
                if(mat[candidate][i] == 1 || mat[i][candidate] == 0){
                    return -1;
                }
            }
        }
        return candidate;
       }

    
    public static void main(String[] args) {
        int[][] mat1 = {
            {0, 1, 1},
            {0, 0, 1},
            {0, 0, 1}
        };
        System.out.println(Celebrity(mat1)); // Output: 2

        int[][] mat2 = {
            {1, 1},
            {1, 1}
        };
        System.out.println(Celebrity(mat2)); // Output: -1

        int[][] mat3 = {
            {1}
        };
        System.out.println(Celebrity(mat3)); // Output: 0
    }
}
