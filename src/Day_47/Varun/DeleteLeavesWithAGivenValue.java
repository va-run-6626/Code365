package Day_47.Varun;

import Day_0_GenericClasses.TreeNode;

public class DeleteLeavesWithAGivenValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(4);

        TreeNode.printIn(root);
        System.out.println();
        TreeNode ans = new Solution().removeLeafNodes(root,2);
        TreeNode.printPost(ans);
    }
}

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return root;
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        return (root.left == null && root.right == null && root.val == target) ? null : root;
    }
}