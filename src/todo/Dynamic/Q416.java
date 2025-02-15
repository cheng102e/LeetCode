package todo.Dynamic;

import java.util.Arrays;

public class Q416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            return false;
        }
        sum = sum / 2;
        // 二维
//        boolean[][] dp = new boolean[n][sum + 1];
//        for (int i = 0; i < n; i++) {
//            dp[i][0] = true;
//        }
//        // 外圈为物品
//        for (int i = 1; i < n; i++) {
//            // 内圈为重量
//            for (int j = 0; j <= sum; j++) {
//                if (j < nums[i]) {
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
//                }
//            }
//        }
//        return dp[n-1][sum];
        // 一维
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                //物品 i 的重量是 nums[i]，其价值也是 nums[i]
                dp[j] = dp[j] || dp[j - nums[i]];
            }
            if (dp[sum]) {
                return true;
            }
        }
        return dp[sum];
    }
}
