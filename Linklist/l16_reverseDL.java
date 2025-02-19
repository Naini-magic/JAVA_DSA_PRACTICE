public class l16_reverseDL{

    

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// two pointer :- [Expected Approach] Using Two Pointer Technique – O(n) Time and O(1) Space

public class FindPairsWithSum {

    static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node first = head;
        Node second = head;

        while (second.next != null){
            second = second.next;
        }

        while (first != second && second.next != first) {
            if ((first.data + second.data) == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(first.data);
                pair.add(second.data);
                res.add(pair);
                first = first.next;
                second = second.prev;
            } else {
                if ((first.data + second.data) < target)
                    first = first.next;
                else
                    second = second.prev;
            }
        }
        return res;
    }
}


    //  O(nlogn) Time and O(n) Space
    public static void pair(Node head , int target){
    ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
     HashSet<Integer> pair = new HashSet<>();

     Node curr = head;
     while(curr != null){
        if(ans.contains(target - curr.data)){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(target.curr.data);
            pair.add(curr.data);
            ans.add(pair);
        }
            ans.add(curr.data);
            curr = curr.next;       
     }
      // Sort the pairs by the first element of the pair
      Collections.sort(
        ans, (a, b) -> a.get(0).compareTo(b.get(0)));

    
     return ans;
    }
}