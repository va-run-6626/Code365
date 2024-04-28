package Day_28.Bhavuk;
import java.util.*;

public class KthSmallestBST {
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);

        Solution solution = new Solution();
        int kthSmallestElement = solution.kthSmallest(root, 3);
        System.out.println("The 3rd smallest element in the BST is: " + kthSmallestElement);
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    int count = 0;
    int out = 0;

    public int kthSmallest(TreeNode root, int k) {
        recur(root, k);
        return out;
    }

    public void recur(TreeNode node, int k) {
        if (node.left != null) {
            recur(node.left, k);
        }
        count++;
        if (count == k) {
            out = node.val;
            return;
        }
        if (node.right != null) {
            recur(node.right, k);
        }
    }


}
