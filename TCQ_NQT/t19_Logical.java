/*
 * Problem Statement
Ankit is given an empty array target and an integer N.

He needs to construct the target array by reading numbers sequentially from the list [1, 2, 3, ..., N].

To build the target array, he can perform the following operations:

"Push": Reads the next element from the list and adds it to the array.
"Pop": Removes the last element added to the array.
He can only "Pop" the most recently "Pushed" element. If the target array is complete, he stops reading more elements. It is guaranteed that such a sequence of operations always exists.

Your task is to help Ankit determine the list of operations needed to build the target array.

Input Format
The first line contains an integer M, the number of elements in the target array.

The second line contains M space-separated integers representing the elements of the target array.

The third line contains the integer N.

Output Format
Print a space-separated string representing the sequence of operations.

 
Constraints
1 <= M, N, target[i] <= 10^5

M <= N

Sample Testcase 0
Testcase Input
1
1
1
Testcase Output
Push
Explanation
Initially, the array is empty. - Push 1: Target array becomes [1]

Sample Testcase 1
Testcase Input
3
1 3 2
3
Testcase Output
 Push Push Pop Push Push
Explanation
- Push 1: Target array becomes [1]


- Push 2: Target array becomes [1, 2]


- Pop: Target array becomes [1]


- Push 3: Target array becomes [1,3]


- Push 2: Target array becomes [1,3,2]
 */





import java.util.*;
public class t19_Logical {
    public static List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int index = 0;

        for (int i = 1; i <= n && index < target.length; i++) {
            ans.add("Push");
            if (target[index] == i) {
                index++;
            } else {
                ans.add("Pop");
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // 🔽 Hardcoded input
        int[] target = {1, 3, 4};
        int n = 5;

        // 🔁 Build the operations list
        List<String> result = buildArray(target, n);

        // 🖨️ Print the result
        for (String operation : result) {
            System.out.print(operation + " ");
        }
        System.out.println(); // Newline at end
    }
}