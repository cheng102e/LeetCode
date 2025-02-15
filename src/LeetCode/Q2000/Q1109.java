package LeetCode.Q2000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/6 16:49
 */
public class Q1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] differ = new int[n];
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            int s = booking[0];
            int e = booking[1];
            int num = booking[2];
            differ[s - 1] += num;
            if (e < n) {
                differ[e] -= num;
            }

        }
        ans[0] = differ[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + differ[i];
        }
        return ans;
    }
}
