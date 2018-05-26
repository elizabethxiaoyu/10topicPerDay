import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eliza Liu on 2018/5/26
 */
public class P383CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || ransomNote.length() ==0)
            return true;
        if(magazine == null || magazine.length()==0)
            return false;
        char[] mags = magazine.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : mags){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        char[] rans = ransomNote.toCharArray();
        for(Character c : rans){
            if(!map.containsKey(c) || map.get(c) ==0)
                return false;
            else {
                map.put(c, map.get(c)-1);
            }
        }
        return true;
    }

}
