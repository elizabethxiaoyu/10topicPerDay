import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Eliza Liu on 2018/4/2
 */
public class P1TwoSum {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int[] re = new P1TwoSum().twoSum(nums, 6);
        for(int i: re)
            System.out.println(i);
    }

    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int[] result = new int[2];
        for(int i = 0 ;i<nums.length;i++){
            for(int j = i+1; j< nums.length;j++){
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                   return result;
                }
            }

        }
        return result;
    }
}
