package todo.Dynamic;

import java.util.Arrays;

public class Q494 {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        int size = (sum + target) / 2;
        if (Math.abs(target) > sum || 2 * size != sum + target) {
            return 0;
        }
        int n = nums.length;
        int[][] dp = new int[n][size + 1];
        if (nums[0] <= size) {
            dp[0][nums[0]] = 1;
        }
        int numZero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                numZero++;
            }
            dp[i][0] = (int) Math.pow(2.0, numZero);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= size; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i]) {
                    dp[i][j] += dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[n - 1][size];
    }

    public static void main(String[] args) {
        findTargetSumWays(new int[]{0}, 0);
    }
}
