/**
 * Created by Eliza Liu on 2018/4/2
 */
public class P167TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int[] re = new P167TwoSum().twoSum(nums, 9);
        for(int i: re)
            System.out.println(i);
    }
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] result = new int[2];
        while(i != j){
            int sum = numbers[i] + numbers[j];
            if( sum == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }else if(sum < target)
                i++;
            else
                j--;

        }
        return result;
    }
}
