/**
 * Created by Eliza Liu on 2018/5/20
 */
public class P189RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        new P189RotateArray().rotate(nums,3);
        for(int i: nums)
            System.out.println(i);

    }
    public void rotate(int[] nums, int k) {
        int length = nums.length;

        for(int i = 0 ;i < k;i++){

            int before = nums[0];
            nums[0] = nums[length-1];
            for(int j = 1 ; j <length ;j++){
                int temp =  nums[j];
                nums[j] = before;
                before = temp;

            }
        }

    }

}
