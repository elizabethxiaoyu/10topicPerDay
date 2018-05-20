/**
 * Created by Eliza Liu on 2018/5/9
 */
public class P104MaxDepth {


    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
