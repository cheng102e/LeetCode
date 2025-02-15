package LeetCode.Q2000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/6 16:10
 */
public class Q1094 {
    public static boolean carPooling(int[][] trips, int capacity) {
        int[] differ = new int[1001];
        int[] ans = new int[1001];
        for (int[] trip : trips) {
            int num = trip[0];
            int in = trip[1];
            int out = trip[2] - 1;
            differ[in] += num;
            if (out + 1 < 1001) {
                differ[out + 1] -= num;
            }
        }
        ans[0] = differ[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] + differ[i];
        }
        for (int i = 0; i < ans.length; i++) {
            if (capacity < ans[i]) {
                return false;
            }
        }
        return true;
    }
}
