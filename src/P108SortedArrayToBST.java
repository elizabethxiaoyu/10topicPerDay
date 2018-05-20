/**
 * Created by Eliza Liu on 2018/5/18
 */

public class P108SortedArrayToBST {

    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = new P108SortedArrayToBST().sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums){
        return ToBST(nums,0,nums.length-1);
    }

    public TreeNode ToBST(int[] nums,int start, int end) {
        if(nums==null || nums.length ==0 || start>end)
            return null;
        if(start == end)
            return  new TreeNode(nums[start]);
        int mid = (end+start)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = ToBST(nums,start,mid-1);
        root.right = ToBST(nums,mid+1,end);
        return root;
    }

}
