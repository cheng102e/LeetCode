package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-08 21:12
 */
public class Q322 {


  public int coinChange(int[] coins, int amount) {
    if (coins.length == 0) {
      return -1;
    }
    int[] dp = new int[amount + 1];
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      dp[i] = amount + 1;
      for (int j = 0; j < coins.length; j++) {
        if (i >= coins[j]) {
          dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
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
