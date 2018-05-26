import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Eliza Liu on 2018/5/26
 */
public class P349Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[0];
        if((nums1 == null || nums1.length ==0) || (nums2 == null || nums2.length ==0))
            return result;
        Set<Integer> set = new HashSet<>();

        for(int i : nums1)
            set.add(i);

        Set<Integer> al = new HashSet<>();
        for(int i : nums2){
            if(set.contains(i))
                al.add(i);
        }
        result = new int[al.size()];
        int index = 0;

        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){
            result[index++] = iterator.next().intValue();
        }
        return result;
    }
}
