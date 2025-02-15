package todo.Map;

import java.util.Deque;
import java.util.LinkedList;

public class Q994 {
    public static void main(String[] args) {
        orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}});
    }

    public static int orangesRotting(int[][] grid) {
        Deque<int[]> deque = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int good = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    deque.offerLast(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    good++;
                }
            }
        }
        if(good == 0){
            return 0;
        }
        int round = 0;
        while (!deque.isEmpty()) {
            round++;
            int count = deque.size();
            for (int i = 0; i < count; i++) {
                int[] index = deque.pollFirst();
                good = update(index, deque, grid, good, m, n);
                if (good == 0) {
                    return round;
                }
            }
        }
        return -1;
    }

    public static int update(int[] index, Deque<int[]> deque, int[][] grid, int count, int m, int n) {
        int i = index[0];
        int j = index[1];
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 2;
            deque.add(new int[]{i - 1, j});
            count--;
        }
        if (i + 1 < m && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 2;
            deque.add(new int[]{i + 1, j});
            count--;
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 2;
            deque.add(new int[]{i, j - 1});
            count--;
        }
        if (j + 1 < n && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 2;
            deque.add(new int[]{i, j + 1});
            count--;
        }

        return count;
    }
}
