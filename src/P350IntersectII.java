import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eliza Liu on 2018/5/26
 */
public class P350IntersectII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] rr = new int[0];
        if((nums1 == null || nums1.length==0) || (nums2==null || nums2.length ==0) )
            return rr;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums1){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) >0 ) {
                result.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        rr = new int[result.size()];
        int index = 0;
        for(Integer i : result){
            rr[index] = i.intValue();
            index++;
        }
        return rr;
    }
}
