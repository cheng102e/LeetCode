package LeetCode.Q1000;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 11:47
 */
public class Q746 {

  public int minCostClimbingStairs(int[] cost) {
    int len = cost.length;
    int dp[] = new int[len + 1];

    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < len; i++) {
      dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
    }
    return Math.min(dp[len - 1], dp[len - 2]);
  }
}
