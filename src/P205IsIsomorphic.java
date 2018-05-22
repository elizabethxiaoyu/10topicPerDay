
public class P205IsIsomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean isIsomorphic(String s, String t) {
		 
		 if(s==null || t == null)
			 return false;
		 int[] tag1 = new int[256];
		 int[] tag2 = new int[256];
		 
		 for(int i = 0 ;i< s.length(); i++) {
			 if(tag1[s.charAt(i)] != tag2[t.charAt(i)])
				 return false;
			 tag1[s.charAt(i)] = i+1;
			 tag2[t.charAt(i)] = i+1;
		 }
		 return true;
	 }
}
