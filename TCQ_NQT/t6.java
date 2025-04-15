import java.util.*;


/*TreeSet is a class in Java that:

Implements the Set interface.

Stores unique elements (like all sets).

Maintains elements in sorted (natural) order automatically.

Is based on a Red-Black Tree (a self-balancing BST).

 */
public class t6 {
    public static List<Integer> findUnion(int n, int m, int[] arr1, int[] arr2) {
        // Write your code here
        Set<Integer> set = new TreeSet<>(); 
        
        // HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        return new ArrayList<>(set);
        
        
        // List<Integer> result = new ArrayList<>(set);
        // Collections.sort(result); 
        // return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            List<Integer> result = findUnion(n, m, arr1, arr2);

            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
