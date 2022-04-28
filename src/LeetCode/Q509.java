package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/10 17:27
 */
public class Q509 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int t = a + b;
            a = b;
            b = t;
        }
        return b;
    }
}
