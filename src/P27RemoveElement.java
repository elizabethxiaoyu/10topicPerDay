/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P27RemoveElement {
    public static void main(String[] args){
        int[] nums =  {3};
        System.out.println(removeElement(nums,3));

    }
    public static int removeElement(int[] nums, int val) {

        if(nums == null || nums.length ==0)
            return 0;
        int start = 0;
        int end = nums.length-1;

        while(end >0 && nums[end] == val){
            end--;
        }
        while(start != end){
            if(nums[start] ==val){
                nums[start] = nums[end];
                nums[end] = val;
                while(end >0 && nums[end] == val){
                    end--;
                }
            }else
                start++;

        }

        if(nums[start] == val)
            return start;
        else
            return start+1;
    }

}
