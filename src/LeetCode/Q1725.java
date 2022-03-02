package LeetCode;

public class Q1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length;
        int ans = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Math.min(rectangles[i][0], rectangles[i][1]);
            if (tmp > maxLen) {
                maxLen = tmp;
                ans = 1;
            } else if (tmp == maxLen) {
                ans++;
            }
        }
        return ans;
    }
}
