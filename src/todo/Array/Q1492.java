package todo.Array;

public class Q1492 {
    public int kthFactor(int n, int k) {
        int count = 0;
        int factor;
        for (factor = 1; factor * factor <= n; factor++) {
            if (n % factor == 0) {
                count++;
            }
            if (count == k) {
                return factor;
            }
        }
        if (count * 2 < k) {
            return -1;
        }
        factor--;
        if (factor * factor == n) {
            factor--;
        }
        for (; factor > 0; factor--) {
            if (n % factor == 0) {
                count++;
            }
            if (count == k) {
                return n / factor;
            }
        }
        return -1;
    }

}
