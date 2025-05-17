class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}


/*Given a binary tree, the diameter (also known as the width) is defined as the number of edges on the longest path between two leaf nodes in the tree. This path may or may not pass through the root. Your task is to find the diameter of the tree. */

public class t4_diameter {
    // triverse----------------------
      public static int diameter(Node root) {
        // Your code here
        int [] dia = new int[1];
        maxEdge(root , dia);
        
        return dia[0];
    }
    
    public static int maxEdge(Node node , int dia[]){
    if(node == null){
            return 0;
        }
        
        int ls = maxEdge(node.left , dia);
        int rs = maxEdge(node.right , dia);
        
        dia[0] = Math.max(dia[0] , ls + rs);
        
        return 1 + Math.max(ls , rs);
    }


     public static void main(String[] args) {
        /*
                Constructing this tree:
                      5
                     / \
                    8   6
                   / \    \
                  3   7    9
         */

        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(9);

        t4_diameter sol = new t4_diameter();
        int result = sol.diameter(root);
        System.out.println("Diameter of the tree (in edges): " + result);
    }
}
