package todo.Dynamic;

public class Q647 {
    public int countSubstrings(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        boolean[][] dp = new boolean[n + 1][n + 1];
        int result = 0;
        // i 左 j 右
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (ch[i] == ch[j]) {
                    if (j - i <= 1) {
                        // 一个或两个
                        result++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        result++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return result;
    }
}
