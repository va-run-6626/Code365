package Day_48.Varun;

import Day_0_GenericClasses.TreeNode;

public class DistributeCoinsInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);

        TreeNode.printPre(root);
        System.out.println();
        int moves = new Solution().distributeCoins(root);
        System.out.println(moves);
    }
}
class Solution {
    private int moves = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    private int dfs(TreeNode root){
        if(root == null) return 0;
        int leftExcess = dfs(root.left);
        int rightExcess = dfs(root.right);
        moves += Math.abs(leftExcess) + Math.abs(rightExcess);
        return root.val + leftExcess + rightExcess -1;
    }
}