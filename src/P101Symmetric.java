/**
 * Created by Eliza Liu on 2018/5/8
 */
public class P101Symmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetric(root.left,root.right);



    }

    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left ==null && right == null)
            return true;
        if(left== null || right ==null)
            return false;
        return left.val== right.val && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}
