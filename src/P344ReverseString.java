/**
 * Created by Eliza Liu on 2018/5/25
 */
public class P344ReverseString {

    public String reverseString(String s) {
        if(s== null || s.length() ==0)
            return "";
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i>=0;i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
