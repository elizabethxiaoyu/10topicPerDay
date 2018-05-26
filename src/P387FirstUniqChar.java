import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Eliza Liu on 2018/5/27
 */
public class P387FirstUniqChar {

    public int firstUniqChar(String s) {
        if(s==null || s.length() == 0)
            return -1;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ; i< chars.length;i++){
           if(!map.containsKey(chars[i]))
               map.put(chars[i],i);
           else
               map.put(chars[i],-1);
        }
        if(map.isEmpty())
            return -1;

        Set<Character> set = map.keySet();
        Iterator<Character> iterator = set.iterator();

        while(iterator.hasNext()){
            Character c = iterator.next();
            if(map.get(c)!=-1)
                return map.get(c);
        }
        return -1;


    }
}
