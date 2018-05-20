/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P121maxProfit {
    public static void main(String[] args){
        int[] nums = {1,2,4,2,5,7,2,4,9,0,9};
        int result = new P121maxProfit().maxProfit(nums);
        System.out.println(result);

    }
    public int maxProfit(int[] prices) {
        if(prices ==null || prices.length ==0)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0 ;i< prices.length;i++){

            if(min > prices[i])
                min = prices[i];
            if(prices[i] - min > max)
                max = prices[i] -min;
        }

        return max;
    }

}
