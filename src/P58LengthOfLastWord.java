/**
 * Created by Eliza Liu on 2018/5/8
 */
public class P58LengthOfLastWord {
    public  static void main(String[] args){
        System.out.println(lengthOfLastWord("         "));

    }

    public static int lengthOfLastWord(String s) {
        if(s==null || s.length()==0 )
            return 0;
        String[] ss = s.split(" ");
        if(ss.length == 0)
            return 0;
        return ss[ss.length-1].length();
    }

}
