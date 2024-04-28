package Day_17.Bhavuk;

public class BinaryTreeInversion {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Printing the original tree
        System.out.println("Original tree:");
        printTree(root);

        // Inverting the tree
        TreeNode invertedRoot = invertTree(root);

        // Printing the inverted tree
        System.out.println("\nInverted tree:");
        printTree(invertedRoot);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        // Base case: If the node is null, return null.
        if(root == null) {
            return null;
        }

        // Recursively invert the left and right subtrees.
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the left and right children of the current node.
        root.left = right;
        root.right = left;

        // Return the root of the inverted tree.
        return root;
    }


    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
