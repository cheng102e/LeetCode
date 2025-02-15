package todo.Dynamic;

public class Q63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            matrix[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            matrix[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                } else {
                    matrix[i][j] = 0;
                }

            }
        }
        return matrix[m - 1][n - 1];
    }

}
