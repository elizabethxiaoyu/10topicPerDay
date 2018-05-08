/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P38CountAndSay {

    public static void main(String[] args){
        System.out.println(countAndSay(6));

    }

    public static String countAndSay(int n) {
        String origin = "1";
        String result = "";
        if(n ==1)
            return "1";
        for(int i = 1; i< n;i++){
            result = "";
            for(int j = 0; j< origin.length();j++){
                char number = origin.charAt(j);
                int count = 1;
                while(j<origin.length()-1 && origin.charAt(j+1) == number){
                    j++;
                    count++;
                }
                    result +=String.valueOf(count);
                    result += number;

            }
            origin = result;
        }
        return result;
    }
}
