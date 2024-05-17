package Day_0_GenericClasses;

public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public static void printPre(TreeNode root){
            if(root == null) return;
            System.out.print(root.val + ",");
            printPre(root.left);
            printPre(root.right);
        }

        public static void printIn(TreeNode root){
            if(root == null) return;
            printPre(root.left);
            System.out.print(root.val + ",");
            printPre(root.right);
        }
    public static void printPost(TreeNode root){
        if(root == null) return;
        printPre(root.left);
        printPre(root.right);
        System.out.print(root.val + ",");
    }
}
