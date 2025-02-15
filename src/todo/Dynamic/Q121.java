package todo.Dynamic;

public class Q121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minCost = prices[0];
        for (int i = 1; i < n; i++) {
            maxProfit = Math.max(prices[i] - minCost, maxProfit);
            minCost = Math.min(prices[i], minCost);
        }
        return maxProfit;
    }
}
