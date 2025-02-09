import java.util.*;

public class ls29_paratha {
    
    // Function to check if we can cook P pratas within given 'mid' minutes
    public static boolean canCookInTime(int[] cooks, int P, int mid) {
        int pratasCooked = 0;
        
        for (int R : cooks) {
            int timeSpent = 0;
            int prataCount = 0;
            
            while (timeSpent + (prataCount + 1) * R <= mid) {
                prataCount++;
                timeSpent += prataCount * R;
                pratasCooked++;
                
                if (pratasCooked >= P) {
                    return true; // If we already cooked enough pratas
                }
            }
        }
        
        return false;
    }

    // Function to find the minimum time required to cook P pratas
    public static int minTimeToCookPratas(int P, int[] cooks) {
        int low = 1, high = 10000000; // Set an arbitrarily large upper bound
        int answer = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (canCookInTime(cooks, P, mid)) {
                answer = mid; // Try for a smaller time
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
     int p = 10;
     int cook[] = {1 ,2 ,3 , 4};
     System.out.println(minTimeToCookPratas(p , cook));
     int p1 = 8;
     int cook2[] = {1 , 1 , 1 , 1, 1 , 1, 1,1};
     System.out.println(minTimeToCookPratas(p1 , cook2));

    }
}
