/**
 * Created by Eliza Liu on 2018/5/25
 */
public class P345ReverseVowels {
    public static  void main(String[] args){
        System.out.println(new P345ReverseVowels().reverseVowels("hello"));
    }
    public String reverseVowels(String s) {
        if(s==null || s.length() ==0)
            return "";
        int left = 0 ;
        int right = s.length()-1;
        char[] chars = s.toCharArray();
        while(left < right){
            char lChar = chars[left];
            while(left < chars.length -1&& lChar!= 'a'&& lChar != 'e' && lChar != 'i' && lChar != 'o' && lChar !='u'&& lChar !='A'
                    && lChar != 'E' && lChar != 'I' && lChar != 'O' && lChar != 'U'){
                 left++;
                lChar = chars[left];
            }

            char rChar = chars[right];
            while(right >0 && rChar!= 'a'&& rChar != 'e' && rChar != 'i' && rChar != 'o' && rChar !='u'&& rChar !='A'
                    && rChar != 'E' && rChar != 'I' && rChar != 'O' && rChar != 'U'){
                right--;
                rChar = chars[right];
            }


            if(left < right){
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
            }
            left++;
            right--;

        }
        return String.valueOf(chars);
    }

}
