/**
 * Created by Eliza Liu on 2018/5/20
 */
public class P172TrailingZeroes {
    /**
     * 能出现0 之能是 2*5 因为2出现的频率比5的高，所以找5的个数就是能出现0的个数
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {

        int count = 0;
        while(n >0){
            count += n/5;
            n/=5;
        }
        return count;

    }
}
