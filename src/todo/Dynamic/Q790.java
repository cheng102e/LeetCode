package todo.Dynamic;

public class Q790 {
    static final int MOD = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n + 1][4];
        // 0123  全空，上空，下空，全满
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            // 前一格全满
            dp[i][0] = dp[i - 1][3];
            // 前一格全空，再一个三格
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            // 前一格全空+前一格空上+前一格空下+前一格满
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD + dp[i - 1][3]) % MOD;
        }
        return dp[n][3];
    }

}
