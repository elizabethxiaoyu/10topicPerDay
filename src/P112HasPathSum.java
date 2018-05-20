/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P112HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.val == sum && root.left == null && root.right ==null)
            return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);

    }
}
