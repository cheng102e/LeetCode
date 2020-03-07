package Question;

public class Q695 {

  public int maxAreaOfIsland(int[][] grid) {
    int i = 0, j = 0;
    int m = grid.length;
    int n = grid[0].length;
    int area = 0, max = 0;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          area = dfs(i, j, m, n, grid, 0);
          max = Math.max(area, max);
        }
      }
    }
    return max;
  }

  private int dfs(int i, int j, int m, int n, int[][] grid, int c_area) {
    if (grid[i][j] == 0 || i < 0 || i >= m || j < 0 || j >= n) {
      return c_area;
    }
    grid[i][j] = 0;
    c_area = c_area + 1;
    c_area = dfs(i + 1, j, m, n, grid, c_area);
    c_area = dfs(i - 1, j, m, n, grid, c_area);
    c_area = dfs(i, j + 1, m, n, grid, c_area);
    c_area = dfs(i, j - 1, m, n, grid, c_area);
    return c_area;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
