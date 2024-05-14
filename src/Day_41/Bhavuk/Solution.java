package Day_41.Bhavuk;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {

        //1.
        if(root==null) return null;

        if(root.val==p.val || root.val==q.val)
            return root;

        TreeNode left =  lowestCommonAncestor(root.left,p,q);
        TreeNode right =  lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null)
            return root;

        if(left!=null )
            return left;
        else
            return right;


    }

}