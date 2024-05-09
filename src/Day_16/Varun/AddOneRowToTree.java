package Day_16.Varun;

import Day_0_GenericClasses.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode A = new TreeNode(2);
        TreeNode B = new TreeNode(6);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(1);
        TreeNode E = new TreeNode(5);

        root.left = A;
        root.right = B;
        A.left = C;
        A.right = D;
        B.left = E;
        BFS(root);
        System.out.println();
        int val = 1;
        int depth = 2;
        TreeNode afterAdd = AddOneRow(root, val,depth);
        BFS(afterAdd);
    }

    private static TreeNode AddOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        return add(root,val,depth,1);
    }

    private static TreeNode add(TreeNode root, int val, int depth, int curr) {
        if(root == null) return null;
        if(curr == depth-1){
            TreeNode lTemp = root.left;
            TreeNode rTemp = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = lTemp;
            root.right.right = rTemp;

            return root;
        }
        root.left = add(root.left,val,depth,curr+1);
        root.right = add(root.right,val,depth,curr+1);
        return root;
    }
    public static void BFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode out = queue.poll();
            System.out.print(out.val+", ");
            if(out.left != null){
                queue.add(out.left);
            }
            if(out.right != null){
                queue.add(out.right);
            }
        }
    }
}
