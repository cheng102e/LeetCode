package LeetCode.Q200;

public class Q121 {

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

}
