/**
 * Created by Eliza Liu on 2018/5/20
 */
public class P171TitleToNumber {

    public static void main(String[] args){

        System.out.println(new P171TitleToNumber().titleToNumber("AB"));
    }
    public int titleToNumber(String s) {
        int length = s.length();
        int sum = 0;
        for(int i = 0; i< length;i++){
            sum+= (s.charAt(i) - 'A' +1) * Math.pow(26,length-1-i);
        }
        return sum;
    }

}
