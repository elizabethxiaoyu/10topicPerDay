import java.util.ArrayList;

/**
 * Created by Eliza Liu on 2018/5/8
 */
public class P66PlusOne {

    public static void main(String[] args){
        int[] digits = {9,9,8};
        int[] r = plusOne(digits);

        for(int i : r)
            System.out.println(i);
    }

    public static int[] plusOne(int[] digits) {
        int signal = 0;
        if(digits[digits.length-1] <9 ){
            digits[digits.length-1] += 1;
            return digits;
        }
        digits[digits.length-1] = 0;
        signal=1;
        for(int i = digits.length-2; i>=0;i--){
           if(digits[i] < 9){
               digits[i]+=1;
               signal = 0;
               break;
           }else{
               digits[i] =0;
               signal = 1;
           }
        }
        if(signal == 0){
            return digits;
        }else{

            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i = 0; i< digits.length;i++)
                result[i+1] = digits[i];
            return result;
        }
    }
}
