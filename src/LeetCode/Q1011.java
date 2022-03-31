package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/10 15:24
 */
public class Q1011 {
    static int shiptime(int[] weights, int h) {
        int day = 1;
        int tmp = h;
        for (int i = 0; i < weights.length; i++) {
            if (tmp < weights[i]) {
                tmp = h;
                day++;
            }
            tmp -= weights[i];
        }
        return day;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 1;

        for (int weight : weights) {
            if (weight > left) {
                left = weight;
            }
            right+=weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int need = shiptime(weights, mid);
            if (need <= days) {
                right = mid;
            } else if (need > days) {
                left = mid + 1;
            }
        }
        return left;
    }
}
