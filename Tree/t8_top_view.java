import java.util.*;

// Tree node definition
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

public class t8_top_view {
    // Function to return a list of nodes visible from the top view
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            if (!map.containsKey(cur.hd)) {
                map.put(cur.hd, cur.node.data);
            }

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

        ArrayList<Integer> result = t8_top_view.topView(root);
        System.out.println("Top view of the binary tree: " + result);
    }
}


