/*Given an array arr[] and k, where the array represents the boards and each element of the given array represents the length of each board. k numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint. The task is to find the minimum time to get this job done by painting all the boards under the constraint that any painter will only paint the continuous sections of boards. say board [2, 3, 4] or only board [1] or nothing but not board [2, 4, 5].

Examples: 

Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
Explanation: The most optimal way will be: Painter 1 allocation : [5,10], Painter 2 allocation : [30], Painter 3 allocation : [20, 15], Job will be done when all painters finish i.e. at time = max(5 + 10, 30, 20 + 15) = 35

 */





public class ls28_Painter_partition{


    public static int painter(int arr[] , int m){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
          sum += arr[i];
        }

        int start = 0;
        int end = sum;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(isPossilbe(arr , m , mid)){
            ans = mid;
            end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossilbe(int arr[] , int m , int mid){
        int p = 1;
        int unit = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > mid){
                return false;
            }
            if(arr[i] + unit <= mid){
                unit += arr[i];
            }else{
                p++;
                unit = arr[i];
                if(p > m){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String []args)
{
    int arr[] = {40 , 30 , 10 , 20};
    int m = 2;
    System.out.println(painter(arr , 2));
}}