import java.util.ArrayList;

/**
 * Created by Eliza Liu on 2018/5/26
 */
public class P371GetSum {
    public static void main(String[] args){

        System.out.println(new P371GetSum().getSum(-1,-2));
    }
    public int getSum(int a, int b) {
        if((a & b) == 0)
            return a|b;
        return getSum((a^b), (a&b)<<1);

    }
}
