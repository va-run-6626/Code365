package Day_14.Varun;

import Day_0_GenericClasses.TreeNode;

public class SumOfLeftLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode A = new TreeNode(9);
        TreeNode B = new TreeNode(20);
        TreeNode C = new TreeNode(15);
        TreeNode D = new TreeNode(7);

        root.left = A;
        root.right = B;
        B.left = C;
        B.right = D;
        System.out.println(new Solution().sumOfLeftLeaves(root));
    }
}

class Solution{
    public int sumOfLeftLeaves(TreeNode root){
        return helper(root,false);
    }
    public int helper(TreeNode root, boolean isLeaf){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return isLeaf ? root.val : 0;
        }
        return helper(root.left,true)+helper(root.right,false);
    }
}
