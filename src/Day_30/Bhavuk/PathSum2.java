package Day_30.Bhavuk;
import java.util.*;

public class PathSum2 {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        Solution solution = new Solution();
        List<List<Integer>> result = solution.pathSum(root, targetSum);

        System.out.println("Paths with sum " + targetSum + ":");
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}
class Solution {


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if (root == null) return ans;

        preorder(ans, path, root, targetSum);
        return ans;
    }

    void preorder(List<List<Integer>> ans, List<Integer> path, TreeNode root, int sum) {
        if (root == null) return;

        sum -= root.val;
        path.add(root.val);
        if (root.right == null && root.left == null && sum == 0) {
            ans.add(new ArrayList<>(path));
        }

        preorder(ans, new ArrayList<>(path), root.left, sum);
        preorder(ans, new ArrayList<>(path), root.right, sum);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
