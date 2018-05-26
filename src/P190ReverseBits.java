/**
 * Created by Eliza Liu on 2018/5/21
 */
public class P190ReverseBits {
    public static void main(String[] args){
        System.out.println(new P190ReverseBits().reverseBits(1));
    }
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0;i--)
            sb.append(s.charAt(i));
        int len = 32-sb.length();
        for(int j = 0 ; j< len;j++)
            sb.append("0");
        long  result = Long.valueOf(sb.toString(),2);
        return (int)result;

    }
}
