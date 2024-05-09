package Day_15.Varun;

import Day_0_GenericClasses.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode A = new TreeNode(9);
        TreeNode B = new TreeNode(0);
        TreeNode C = new TreeNode(5);
        TreeNode D = new TreeNode(1);

        root.left = A;
        root.right = B;

        A.left = C;
        A.right = D;

        int sum = new Solution().sumNumbers(root);
        System.out.println(sum);
    }
    static class Solution{
        public int sumNumbers(TreeNode root){
            List<Integer> list = new ArrayList<>();
            helper(root,0,list);
            int ans = 0;
            for(Integer i : list){
                ans += i;
            }
            return ans;
        }
        public void helper(TreeNode root, int num, List<Integer> list){
            if(root != null){
                num = num * 10 + root.val;
                if(root.left == null && root.right == null){
                    list.add(num);
                }
                helper(root.left,num,list);
                helper(root.right,num,list);
            }
        }
    }
}
