
public class P326IsPowerOfThree {
	
	public static void main(String[] args) {
		System.out.println(new P326IsPowerOfThree().isPowerOfThree(243));
	}
	 public boolean isPowerOfThree(int n) {
		 double result = Math.log10(n)/Math.log10(3);
		 if((int) result == result)
			 return true;
		 else
			 return false;
	 }
}	
