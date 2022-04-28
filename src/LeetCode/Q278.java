package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/3 18:42
 */
public class Q278 {

    boolean isBadVersion(int version) {
        return true;
    }


    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}