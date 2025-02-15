package LeetCode.Q1000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/10 14:45
 */
public class Q875 {
    static int eatTime(int[] piles, int x) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / x;
            if (piles[i] % x > 0) {
                hours++;
            }
        }
        return hours;
    }

    public static int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            if (pile > right) {
                right = pile;
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int hour = eatTime(piles, mid);
            if (hour < H) {
                right = mid - 1;
            } else if (hour > H) {
                left = mid + 1;
            } else if (hour == H) {
                right = mid;
            }
        }
        return left;
    }
}
