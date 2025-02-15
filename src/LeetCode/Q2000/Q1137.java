package LeetCode.Q2000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/23 15:19
 */
public class Q1137 {
    public int tribonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int t = a + b + c;
            a = b;
            b = c;
            c = t;
        }
        return c;
    }
}
