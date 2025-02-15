package todo.Dynamic;

public class Q188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2 * k];
        for (int i = 0; i < 2 * k; i = i + 2) {
            dp[0][i] = -prices[0];
        }

        for (int i = 1; i < n; i++) {
            // 第一次买卖。第二次买卖
            // 前一个是今天不操作，后一个是今天操作
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            for (int j = 1; j <= 2 * k - 1; j++) {
                int pow = j % 2 == 1 ? 1 : -1;
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + pow * prices[i]);
            }
        }
        return dp[n - 1][2 * k - 1];
    }
}
