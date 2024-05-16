package Day_46.Varun;

import Day_0_GenericClasses.TreeNode;

public class EvaluateBooleanBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(0);
        TreeNode a4 = new TreeNode(1);

        root.left = a1;
        root.right = a2;
        a2.left = a3;
        a2.right = a4;

        boolean ans = new Solution().evaluateTree(root);
        System.out.println(ans);
    }
}
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            if(root.val == 1){
                return true;
            }else{
                return false;
            }
        }
        boolean calLeft = evaluateTree(root.left);
        boolean calRight = evaluateTree(root.right);
        boolean ans = false;
        if(root.val == 2){
            ans = calLeft || calRight;
        }else{
            ans = calRight && calLeft;
        }
        return ans;
    }
}