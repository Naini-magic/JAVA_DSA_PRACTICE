import java.util.*;
public class t17 {

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class Main {
    public static ListNode middleNode(ListNode head) {
    List<Integer> values = new ArrayList<>();

    // Step 1: Convert LinkedList to List
    ListNode current = head;
    while (current != null) {
        values.add(current.val);
        current = current.next;
    }

    // Step 2: Sort the list
    Collections.sort(values);

    // Step 3: Find the middle index
    int n = values.size();
    int midIndex = (n % 2 == 0) ? (n / 2 - 1) : (n / 2);

    // Step 4: Create a new sorted LinkedList (optional, just to return the middle node)
    ListNode sortedHead = constructLL(values.stream().mapToInt(i -> i).toArray(), 0);

    // Step 5: Traverse to the middle node
    ListNode temp = sortedHead;
    for (int i = 0; i < midIndex; i++) {
        temp = temp.next;
    }

    return temp;
}


    public static ListNode constructLL(int[] arr, int si) {
        if (si == arr.length) return null;
        ListNode head = new ListNode(arr[si]);
        head.next = constructLL(arr, si + 1);
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ListNode head = constructLL(arr, 0);
        ListNode middle_node = middleNode(head);
        if (middle_node != null) {
            System.out.println(middle_node.val);
        } else {
            System.out.println(0);
        }
    }
}
}
