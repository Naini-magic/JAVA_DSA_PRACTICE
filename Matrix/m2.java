public class m2 {
    import java.util.ArrayList;

public class m1 {
  public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
    // code here
    int n = mat.length;
    int m = mat[0].length;
    int top = 0 , bottom = n - 1;
    int left = 0 , right = m - 1;
    ArrayList<Integer> ans = new ArrayList<>();
    
    while( top <= bottom && left <= right ){
        for( int i = left ; i <= right ; i++){
            ans.add(mat[top][i]);
        }
        top++;
        for(int i = top ; i <= bottom ; i++){
            ans.add(mat[i][right]);
        }
        right--;
        
        if(top <= bottom){
            for(int i = right ; i >= left ; i--){
                ans.add(mat[bottom][i]);
            }
            bottom--;
        }
        
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                ans.add(mat[i][left]);
            }
            left++;
        }
        
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4} , {5, 6, 7, 8} , {9, 10, 11, 12} , {13, 14, 15, 16}};
        System.out.println(spirallyTraverse(arr));
    }
}

}
