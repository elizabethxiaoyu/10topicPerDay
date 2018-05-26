
public class P283MoveZeroes {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for(int i : nums)
			System.out.println(i);
	}
	 public static void moveZeroes(int[] nums) {
		 if(nums== null || nums.length == 0)
			 return;
	       int length  = nums.length;
	       
	       int front = 0;
	       int rear = 0;
	       
	      while(rear < length) {
	    	   while(rear < length && nums[rear]==0)
	    		   rear++;
	    	   if(rear < length)
	    		   nums[front++] = nums[rear];
	    	   rear++;
	    		   
	       }
	       while(front < length) {
	    	   nums[front++] = 0;
	       }
	 }
}
