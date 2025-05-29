



import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class t6_leftView {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        left(ans, root, 0);
        return ans;
    }

    void left(ArrayList<Integer> ans, Node root, int level) {
        if (root == null) return;

        if (level == ans.size()) {
            ans.add(root.data);
        }

        left(ans, root.left, level + 1);
        left(ans, root.right, level + 1);
    }


    public static void main(String[] args) {
        // Build sample binary tree
        /*
                 1
               /   \
              2     3
               \   /
                4 5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);

        // Run left view logic
        t6_leftView sol = new t6_leftView();
        ArrayList<Integer> result = sol.leftView(root);

        // Print result
        System.out.println("Left view of the tree: " + result);
    }
}
