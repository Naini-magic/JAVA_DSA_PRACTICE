
    class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class t5_mirror {

    // Recursive method to mirror the binary tree
    public static TreeNode mirror(TreeNode root) {
        if (root == null) return null;

        // Recursively mirror left and right subtrees
        TreeNode leftMirror = mirror(root.left);
        TreeNode rightMirror = mirror(root.right);

        // Swap the left and right pointers
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // In-order traversal to test the result
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Original tree:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.print("Inorder of original tree: ");
        inorder(root);

        mirror(root);

        System.out.print("\nInorder of mirrored tree: ");
        inorder(root);
    
}

}
