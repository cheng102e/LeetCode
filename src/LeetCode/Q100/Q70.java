package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2019/12/28 18:19
 */
public class Q70 {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if (n <= 2) {
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
