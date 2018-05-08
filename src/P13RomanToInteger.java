import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P13RomanToInteger {
    public static void main(String[] args){
        System.out.println(new P13RomanToInteger().romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

        Map<Character,Integer> elements = new HashMap<Character, Integer>();
        elements.put('M',1000);
        elements.put('D',500);
        elements.put('C',100);
        elements.put('L',50);
        elements.put('X',10);
        elements.put('V',5);
        elements.put('I',1);

        if(map.containsKey(s)){
            return map.get(s);
        }

        int length = s.length();
        int result= 0;
        for(int i= 0 ;i <length;i++){

            if(s.charAt(i) == 'I'){
                if(i!=length-1 && s.charAt(i+1) == 'V'){
                    result += 4;
                    i++;
                }else if(i != length-1 && s.charAt(i+1) == 'X'){
                    result += 9;
                    i++;
                }else{
                    result +=1;
                }

            }else if(s.charAt(i) == 'X'){
                if(i!=length-1 && s.charAt(i+1) == 'L'){
                    result += 40;
                    i++;
                }else if(i != length-1 && s.charAt(i+1) == 'C'){
                    result += 90;
                    i++;
                }else{
                    result +=10;
                }
            }else if(s.charAt(i) == 'C'){
                if(i!=length-1 && s.charAt(i+1) == 'D'){
                    result += 400;
                    i++;
                }else if(i != length-1 && s.charAt(i+1) == 'M'){
                    result += 900;
                    i++;
                }else{
                    result +=100;
                }
            }else {
                result += elements.get(s.charAt(i));
            }
        }
        return  result;
    }


}
