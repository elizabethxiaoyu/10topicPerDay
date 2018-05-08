/**
 * Created by Eliza Liu on 18-5-8
 */
public class P70ClimbStairs {
    public static void main(String[] args){
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n) {
       int[] nums = new int[n];
        if(n==1)
            return 1;
        if(n==0)
            return 0;
       nums[0] = 1;
       nums[1] = 2;
       for(int i = 2 ;i< n;i++){
           nums[i] = nums[i-1] + nums[i-2];
       }
       return nums[n-1];
    }
}
