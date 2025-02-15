package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/1 9:15
 */
public class Q69 {

    public static int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x/mid == mid) {
                return mid;
            } else if (x/mid > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        mySqrt(2147395599);
    }
}
