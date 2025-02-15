package LeetCode.Q400;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/3 17:09
 */
public class Q374 {

    public int guess(int version) {
        return 1;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
