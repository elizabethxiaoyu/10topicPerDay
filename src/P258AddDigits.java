
public class P258AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(19));
	}
	
	 public static  int addDigits(int num) {
		if(num == 0)
			return 0;
		 for(int i = 1; i<10; i++ ) {
			 if((num-i) % 9 == 0)
				 return i;
		 }
		 return 0;
	 }

}
