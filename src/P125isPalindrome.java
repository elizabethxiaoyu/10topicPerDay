/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P125isPalindrome {
    public  static void main(String[] args){
        System.out.println(new P125isPalindrome().isPalindrome(".,"));
    }

    public boolean isPalindrome(String s) {
        if(s == null)
            return true;
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            while(l < s.length() &&!(s.charAt(l)>=48 && s.charAt(l)<=57) && !(s.charAt(l) >=97 && s.charAt(l) <=122))
                l++;
            while(r > -1 && !(s.charAt(r)>=48 && s.charAt(r)<=57) && !(s.charAt(r) >=97 && s.charAt(r) <=122))
                r--;

            if(l<s.length() && r>-1 &&s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
