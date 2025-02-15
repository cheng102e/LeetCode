package LeetCode.Q2000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/24 18:10
 */
public class Q1523 {
    public int countOdds(int low, int high) {
        int ans = (high - low) >> 1;
        int x = low % 10;
        int y = high % 10;

        if (x % 2 == 1||y % 2 == 1) {
            ans++;
        }
        return ans;
    }
}
