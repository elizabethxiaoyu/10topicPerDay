
public class P202HappyNumber {

	public static void main(String[] args) {
		System.out.println(new P202HappyNumber().isHappy(19));// TODO Auto-generated method stub

	}
	
	public boolean isHappy(int n) {
		while(n != 1) {
			n = getNum(n);
			if(n == 4)
				return false;
			if(n ==1)
				return true;
		}
		return true;
		
	}
	
	public static int getNum(int num) {
		
		int result = 0;
		while(num >0 ) {
			result += Math.pow(num%10, 2);
			num/=10;
			
		}
		return result;
	}
}
