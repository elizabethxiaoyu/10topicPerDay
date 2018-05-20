/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P110IsBalanced {


    boolean tag =true;
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        height(root);
        return tag;
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight  = height(root.right) ;
        if(Math.abs(leftHeight - rightHeight) >1){
            tag = false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
