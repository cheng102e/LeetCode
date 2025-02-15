package todo.Dynamic;

public class Q5 {
    public static void main(String[] args) {
        longestPalindrome("a");
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int len = 0;
        int start = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] && j - i + 1 > len) {
                        len = j - i;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + len + 1);
    }
}
