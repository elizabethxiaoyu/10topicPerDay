/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P111MinDepth {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        if(leftHeight == 0 || rightHeight == 0)
            return Math.max(leftHeight,rightHeight);
        return Math.min(leftHeight,rightHeight)+1;

    }
}
