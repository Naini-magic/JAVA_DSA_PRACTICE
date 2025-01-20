public class p11_Interval {
    public static void main(String[] args) {
        
    }
// wrong for right soltuion go to leetcode problems
    public static int[][] merge(int[][] intervals){
        int i = 0;
        while( i < intervals.length ){
            if(intervals.length == 1){
                return intervals;
            }
            if(intervals[i][1] < intervals[i+1][0]){
                i++;
            }
            else{
                int merge[] = {intervals[i][0] , intervals[i+1][1]};
                delete(intervals[i+1]);
            }
        }
    }
}
