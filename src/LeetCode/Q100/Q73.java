package LeetCode.Q100;

public class Q73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstLine = false;
        for (int i = 0; i < m; i++) {
            // 若第一列有0，则第一列之后需要置为0
            if (!firstLine && matrix[i][0] == 0) {
                firstLine = true;
            }
            // 行和列均标记
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 反向循环避免破坏第一行和第一列
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            // 第一列单独处理
            if (firstLine) {
                matrix[i][0] = 0;
            }
        }
    }
}
