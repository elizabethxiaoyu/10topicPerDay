/**
 * Created by Eliza Liu on 2018/5/25
 */
public class P34IsPowerOfFour {
    public boolean isPowerOfFour(int num) {
        double result = Math.log10(num)/Math.log10(4);

        return (int)result == result ? true : false;
    }
}
