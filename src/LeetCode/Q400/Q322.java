package LeetCode.Q400;

import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-08 21:12
 */
public class Q322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 用amount+1避免溢出
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    // 用或不用该硬币
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
