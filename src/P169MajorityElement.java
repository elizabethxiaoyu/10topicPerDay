import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Eliza Liu on 2018/5/20
 */
public class P169MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
