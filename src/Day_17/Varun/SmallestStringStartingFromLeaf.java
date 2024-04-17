package Day_17.Varun;

import Day_0_GenericClasses.TreeNode;

public class SmallestStringStartingFromLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(3);
        TreeNode F = new TreeNode(4);

        root.left = A;
        root.right = B;
        A.left = C;
        A.right = D;
        B.left = E;
        B.right = F;

        String small = findSmall(root);
        System.out.println(small);
    }

    private static String findSmall(TreeNode root) {
        StringBuilder small = new StringBuilder();
        dfs(root,new StringBuilder(),small);
        return small.toString();
    }

    private static void dfs(TreeNode root, StringBuilder path, StringBuilder small) {
        if(root == null)return;;

        path.append((char) ('a'+root.val));
        if(root.left == null && root.right == null){
            String curr = path.reverse().toString();
            if(small.isEmpty() || curr.compareTo(small.toString()) < 0){
                small.setLength(0);
                small.append(curr);
            }
            path.reverse();
        }

        dfs(root.left, path,small);
        dfs(root.right,path,small);

        path.setLength(path.length()-1);
    }
}
