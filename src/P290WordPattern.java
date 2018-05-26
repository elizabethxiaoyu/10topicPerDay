import java.util.HashMap;
import java.util.Map;

public class P290WordPattern {
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
	
	 public static boolean wordPattern(String pattern, String str) {
		 Map<Character, Integer> chars = new HashMap<>();
		 int charNum = 0;
		 StringBuilder charResult = new StringBuilder();
		 
		 Map<String, Integer> strings = new HashMap<>();
		 int stringNum = 0;
		 StringBuilder stringResult = new StringBuilder();
		 
		 for(char c: pattern.toCharArray()) {
			 if(chars.containsKey(c)) {
				 charResult.append(chars.get(c));
			 }else {
				 chars.put(c, charNum);
				 charNum++;
			 }
		 }
		 
		 String[] stringss = str.split(" ");
		 if(stringss.length != pattern.length())
			 return false;
		 for(String s: stringss) {
			 if(strings.containsKey(s)) {
				 stringResult.append(strings.get(s));
			 }else {
				 strings.put(s, stringNum);
				 stringNum++;
			 }
		 }
		 return charResult.toString().equals(stringResult.toString());
	 }
}

