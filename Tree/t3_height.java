/*Given a binary tree, find its height.

The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children. */


public class t3_height {
    public static int height(Node node) {
        // code here
        if(node == null){
            return -1;
        }
        
        int ls = height(node.left);
        int rs = height(node.right);
        
        return 1 + Math.max(ls , rs);
    }
}
