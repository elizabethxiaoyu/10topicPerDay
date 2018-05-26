
public class P268MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i : nums)
        	sum+=i;
        return (n+1)*n/2 - sum;
    }

}
