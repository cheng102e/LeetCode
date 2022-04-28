package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/25 8:36
 */
public class Q367 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long ans = (long) mid * mid;
            if (ans == num) {
                return true;
            } else if (ans < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
