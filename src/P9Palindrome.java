/**
 * Created by Eliza Liu on 2018/4/3
 */
public class P9Palindrome {

    public static void main(String[] args){

       System.out.println(new P9Palindrome().isPalindrome( 121));

    }

    public boolean isPalindrome(int x) {
        int origin = x;
        if(x < 0 ||( x!= 0 && x%10==0))
            return false;
        int reverse = 0;
        while(x > 0){
            reverse = reverse*10 + x%10;
            x/=10;
        }

        return (reverse == origin );
    }
}
