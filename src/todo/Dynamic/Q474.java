package todo.Dynamic;

public class Q474 {
    public static int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len + 1][m + 1][n + 1];
        for (int i = 1; i <= len; i++) {
            int[] count = getCount(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    if (j >= count[0] && k >= count[1]) {
                        dp[i][j][k] = Math.max(dp[i - 1][j - count[0]][k - count[1]] + 1, dp[i - 1][j][k]);
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }

        return dp[len][m][n];
    }

    public static int[] getCount(String str) {
        int n = str.length();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') {
                count++;
            }
        }
        return new int[]{count, n - count};
    }

    public static void main(String[] args) {
        findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3);
    }
}
