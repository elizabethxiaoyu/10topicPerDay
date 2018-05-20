/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P167TwoSumII {


    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }else if(sum < target)
                left++;
            else
                right--;

        }
        return result;
    }

}
