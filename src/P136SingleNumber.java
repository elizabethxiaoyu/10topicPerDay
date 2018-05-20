/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P136SingleNumber {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(new P136SingleNumber().singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i = 1 ;i < nums.length;i++){
            result = result  ^ nums[i];
        }
        return result;
    }

}
