/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P122MaxProfitII {
    //贪心算法
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0 ;i< prices.length-1;i++){
            if(prices[i]  <  prices[i+1])
                sum+= (prices[i+1] - prices[i]);
        }
        return sum;
    }
}
