package todo.Dynamic;

public class Q152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[n + 1][2];
        // 最小，最大
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 0; i < n; i++) {
            dp[i + 1][0] = Math.min(nums[i], Math.min(nums[i] * dp[i][0], nums[i] * dp[i][1]));
            dp[i + 1][1] = Math.max(nums[i], Math.max(nums[i] * dp[i][0], nums[i] * dp[i][1]));
            max = Math.max(dp[i+1][1],max);
        }
        return max;
    }
}
