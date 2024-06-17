package Day_48.Bhavuk;

import Day_0_GenericClasses.TreeNode;

class Solution {
    private int moves = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftExcess = dfs(root.left);
        int rightExcess = dfs(root.right);

        // Calculate the total moves needed
        moves += Math.abs(leftExcess) + Math.abs(rightExcess);

        // Return the excess coins at this node
        return root.val + leftExcess + rightExcess - 1;
    }
}