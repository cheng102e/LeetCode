package LeetCode.Q100;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/28 21:05
 */
public class Q59 {
    public static int[][] generateMatrix(int n) {
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int[][] ans = new int[n][n];
        int x = 0;
        int y = -1;
        int turn = 0;
        int tag = 0;
        for (int i = 1; i <= n * n && tag != 4; i++) {
            if (turn == 0) {
                if (y < right ) {
                    y++;
                    ans[x][y] = i;
                    tag = 0;
                } else {
                    up++;
                    i--;
                    turn = 1;
                    tag++;
                }
            } else if (turn == 1) {
                if (x < down ) {
                    x++;
                    ans[x][y] = i;
                    tag = 0;
                } else {
                    right--;
                    i--;
                    turn = 2;
                    tag++;
                }
            } else if (turn == 2) {
                if (y > left ) {
                    y--;
                    ans[x][y] = i;
                    tag = 0;
                } else {
                    down--;
                    i--;
                    turn = 3;
                    tag++;
                }
            } else {
                if (x > up ) {
                    x--;
                    ans[x][y] = i;
                    tag = 0;
                } else {
                    left++;
                    i--;
                    turn = 0;
                    tag++;
                }
            }
        }
        return ans;
    }


}
