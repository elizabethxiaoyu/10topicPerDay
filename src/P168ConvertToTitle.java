import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P168ConvertToTitle {

    public static void main(String[] args){
        System.out.println(new P168ConvertToTitle().convertToTitle(701));
    }

    public String convertToTitle(int n) {
        String result = "";
        while(n !=0){
            result= ((char)('A'+(n-1)%26)) + result;
            n = (n-1)/26;
        }

        return result;
    }
}
