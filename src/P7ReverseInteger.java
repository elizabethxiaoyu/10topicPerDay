/**
 * Created by Eliza Liu on 2018/4/2
 */
public class P7ReverseInteger {
    public static void main(String[] args){

        int re = new P7ReverseInteger().reverse(-2147483648);

            System.out.println(re);
    }
    public int reverse(int x) {
        int flag = 1;
        if(x < 0)
            flag = -1;
        if(x == Integer.MIN_VALUE)
            return 0;
        int temp  = Math.abs(x);
        String s = Integer.toString(temp);

        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        long result = Long.valueOf(s);

        if(flag*result > Integer.MAX_VALUE || flag*result < Integer.MIN_VALUE)
            return 0;
        return (int)(flag * result);



    }
}
