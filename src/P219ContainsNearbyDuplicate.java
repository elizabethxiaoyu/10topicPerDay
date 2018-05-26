import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eliza Liu on 2018/5/22
 */
public class P219ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int length = nums.length;
//
//        for(int i = 0 ; i< length-k; i++){
//            for(int j = 1; j <= k;j++){
//                if(nums[i] == nums[i+j])
//                    return true;
//            }
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],i);
            else{
                if(i-map.get(nums[i]) <= k)
                    return true;
                else
                    map.put(nums[i],i);
            }

        }
        return false;
    }

}
