    import java.util.*;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Solution class with ZigZag traversal method
public class t10_zigzag {
    public static List<Integer> zigZagTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();
                level.add(current.data);

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            result.addAll(level);
            leftToRight = !leftToRight;  // Toggle direction
        }

        return result;
    }


// Main class to run the program

    public static void main(String[] args) {
        /*
              1
            /   \
           2     3
          / \   / \
         4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = t10_zigzag.zigZagTraversal(root);
        System.out.println("ZigZag Traversal: " + result);
    }
}


