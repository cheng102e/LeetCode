package LeetCode;

import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-08 21:12
 */
public class Q322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        if (dp[amount] == amount + 1) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}
