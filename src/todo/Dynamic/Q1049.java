package todo.Dynamic;

import java.util.Arrays;

public class Q1049 {
    public static int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int[][] dp = new int[n][target + 1];
        for (int i = stones[0]; i <= target; i++) {
            dp[0][i] = stones[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= stones[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return sum - 2 * dp[n - 1][target];
    }

    public static void main(String[] args) {
        lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1});
    }
}