
public class P303NumArray {
	
	int[] nums;
	int[] sums;
	public P303NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        if(nums!= null && nums.length !=0)
        	sums[0] = nums[0];
        for(int i = 1 ;i< nums.length;i++) {
        	sums[i] = sums[i-1]+nums[i];
        }
        
    }
    
    public int sumRange(int i, int j) {
    	if(i==0)
    		return sums[j];
    	else
    		return sums[j] - sums[i-1];
    }
}
