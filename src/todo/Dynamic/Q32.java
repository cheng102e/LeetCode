package todo.Dynamic;

public class Q32 {
    public static void main(String[] args) {
        longestValidParentheses("))())()()())))");
    }
    public static int longestValidParentheses(String s) {
        int max = 0;
        int n = s.length();
        int[] dp = new int[n];
        char[] chs = s.toCharArray();
        for (int i = 1; i < n; i++) {
            // 只有右括号才是完整的
            if (chs[i] == ')') {
                if (chs[i - 1] == '(') {
                    // 和前一个刚好一对
                    dp[i] = 2;
                    // 若这对括号之前还有成对，则增加
                    if (i > 2) {
                        dp[i] += dp[i - 2];
                    }
                } else {
                    // 前一个也要向前递归
                    if (dp[i - 1] > 0) {
                        // 前一个已成对，判断往前
                        int lastIndex = i - dp[i - 1] - 1;
                        if (lastIndex >= 0 && chs[lastIndex] == '(') {
                            dp[i] = dp[i - 1] + 2;
                            // 若再向前合法，也加入
                            if (lastIndex - 1 >= 0) {
                                dp[i] += dp[lastIndex - 1];
                            }
                        }
                    }
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
