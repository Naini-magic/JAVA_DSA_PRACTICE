import java.util.*;


//LevelOrderTraversal 

class Node {
    int data;
    Node left, right;

    Node(int value) {
        this.data = value;
        left = right = null;
    }
}

public class t1_LevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);//is used to add an element to the queue — it is similar to queue.add(element).Preferred when you're using capacity-limited queues (e.g., ArrayBlockingQueue)



        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                currentLevel.add(curr.data);

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    // 🔽 Main method for testing
    public static void main(String[] args) {
        /*
                Sample Tree:
                    1
                   / \
                  2   3
                 /   / \
                4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        t1_LevelOrderTraversal tree = new t1_LevelOrderTraversal();
        List<List<Integer>> result = tree.levelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
} 
