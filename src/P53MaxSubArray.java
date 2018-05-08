import com.sun.javafx.image.IntPixelGetter;

/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P53MaxSubArray {

    public static void main(String[] args){
        int[] nums = {-3,-2,0,-1};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int i = 0 ;i< nums.length;i++){
            sum+= nums[i];
            //去掉以负数开头的序列 同时也要考虑，如果全为负数，序列和就要和单个元素比较
            maxSum = Math.max(maxSum,sum);
            maxSum = Math.max(maxSum,nums[i]);
            //不以负数开头
            if(sum < 0)
                sum = 0;
        }
        return maxSum;
    }

}
