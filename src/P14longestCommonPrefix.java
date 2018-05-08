/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P14longestCommonPrefix {
    public static void main(String[] args){
        String[] ss = {"dog","racecar","car"};
        System.out.println(new P14longestCommonPrefix().longestCommonPrefix(ss));

    }
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if(strs.length ==0)
            return s;
        for(int j = 0 ;j < strs[0].length();j++){
            char current = strs[0].charAt(j);
            for(int i =0 ;i< strs.length;i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != current) {
                    return s;
                }
            }
            s+=current;
        }
        return s;
    }

}
