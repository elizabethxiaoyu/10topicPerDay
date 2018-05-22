
public class P204CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new P204CountPrimes().countPrimes(8));
	}
	
//	 public int countPrimes(int n) {
//		 
//		 int count = 0;
//		 for( int i = 1; i< n;i++) {
//			 if(isPrime(i))
//				 count++;
//		 }
//		 return count;
//	 }
//	 public static boolean isPrime(int n) {
//		if(n < 2)
//			return false;
//		
//		 for(int i = 2 ; i *i <= n ;i++) {
//			 if(n%i ==0)
//				 return false;
//		 }
//		 return true;
//	 }
	
	public int countPrimes(int n) {
		int count= 0 ;
		boolean[] flag = new boolean[n];
		
		for(int i = 2; i<n;i++) {
			
			if(flag[i] == false)
				count++;
			
			for(int j = 1; j* i <n;j++) {
				flag[j*i] = true;
			}
		}
		return count;
		
	}
}
