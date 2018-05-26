
public class P263IsUgly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isUgly(int num) {
		 if (num==0)
	          return false;
	    
		 while(num % 5 == 0 )
	    	num /= 5;
		 while(num % 3 == 0)
			 num /=3;
		 while(num % 2 ==0)
			 num /=2;
		 
	     return (num==1);
	 }

}
