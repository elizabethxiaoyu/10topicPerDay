/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P28strStr {
    public static void main(String[] args){
        System.out.println(strStr("aaaaa", "ba"));
    }

    public static int strStr(String haystack, String needle) {
        if((haystack ==null || haystack.length() ==0) &&(needle == null || needle.length() ==0))
            return 0;

        if(haystack ==null || haystack.length() ==0)
            return -1;
        if(needle == null || needle.length() ==0)
            return 0;

        if(needle.length() > haystack.length())
            return -1;
        for(int i =0 ;i <= haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                for(;j<needle.length();j++){
                    if(haystack.charAt(i+j) != needle.charAt(j))
                        break;
                }
                if(j == needle.length())
                    return i;
            }
        }
    return -1;
    }

}
