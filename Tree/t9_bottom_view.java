import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Pair to store node and horizontal distance
class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class t9_bottom_view {  
    static ArrayList<Integer> BottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair cur = q.poll();
        


            // reome the if condition of top view 
                map.put(cur.hd, cur.node.data);
            

            if (cur.node.left != null) {
                q.add(new Pair(cur.node.left, cur.hd - 1));
            }

            if (cur.node.right != null) {
                q.add(new Pair(cur.node.right, cur.hd + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
             1
           /   \
          2     3
           \   / \
            4 5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> result = t9_bottom_view.BottomView(root);
        System.out.println("Bottom view of the binary tree: " + result);
    }
}