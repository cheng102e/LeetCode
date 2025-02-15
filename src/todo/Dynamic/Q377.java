package todo.Dynamic;

public class Q377 {
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
//        int n = nums.length;
//        int[][] dp = new int[n + 1][target + 1];
//
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = 1;
//        }
////        for (int i = nums[0]; i <= target; i++) {
////            dp[0][i] = dp[0][i - nums[0]];
////        }
//        for (int j = 1; j <= target; j++) {
//            for (int i = 1; i <= n; i++) {
//                dp[i][j] = dp[i - 1][j];
//                if (j >= nums[i - 1]) {
//                    dp[i][j] += dp[i - 1][j] + dp[n - 1][j - nums[i - 1]];
//                }
//            }
//        }
//        return dp[n - 1][target];
    }

    public static void main(String[] args) {
        combinationSum4(new int[]{1, 2, 3}, 4);
    }
}
