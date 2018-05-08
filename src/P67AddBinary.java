/**
 * Created by Eliza Liu on 2018/5/8
 */
public class P67AddBinary {

    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        String longer ;
        String shorter ;
        if(a.length() > b.length()){
            longer = a;
            shorter = b;
        }else{
            longer = b;
            shorter = a;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i < longer.length()-shorter.length();i++)
            sb.append("0");
        sb.append(shorter);
        shorter = sb.toString();
        System.out.println(longer + "  "+shorter);
        int signal = 0;
        StringBuilder result = new StringBuilder();
        for(int i = longer.length()-1;i >=0;i--){
            if(longer.charAt(i) == '1' && shorter.charAt(i) == '1'){
                if(signal == 1)
                    result.append("1");
                else
                    result.append("0");

                signal =1;
            }else if(longer.charAt(i) == '0' && shorter.charAt(i) == '0') {
                result.append(String.valueOf(signal));
                signal = 0;
            }else{
                if(signal ==1) {
                    result.append(0);
                    signal = 1;
                }else{
                    result.append(1);
                    signal = 0;
                }
            }

        }
        //System.out.println(sb.toString());
        if(signal == 1)
            result.append("1");

        return result.reverse().toString();


    }
}
