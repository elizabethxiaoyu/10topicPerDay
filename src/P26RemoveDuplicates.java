/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P26RemoveDuplicates {

    public static void main(String[] args){
        int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
    public static  int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        int start  = 1;
        int element = nums[0];
        for(int i = 1; i<nums.length; i++){
                if(nums[i] != element) {
                    nums[start++] = nums[i];
                    element = nums[i];
                }
        }
        return start;
    }

}
