import java.util.Arrays;

/**
 * Created by Eliza Liu on 2018/5/22
 */
public class P217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
