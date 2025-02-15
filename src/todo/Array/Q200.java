package todo.Array;

public class Q200 {
    public int numIslands(char[][] grid) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 未遍历的岛屿才会继续判断
                if (grid[i][j] == '1') {
                    result++;
                    tranverse(grid, i, j, m, n);
                }
            }
        }

        return result;
    }

    public void tranverse(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (grid[i][j] == '1') {
            grid[i][j] = '2';
            tranverse(grid, i + 1, j, m, n);
            tranverse(grid, i - 1, j, m, n);
            tranverse(grid, i, j + 1, m, n);
            tranverse(grid, i, j - 1, m, n);
        }
    }
}
