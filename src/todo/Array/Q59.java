package todo.Array;

public class Q59 {
    public int[][] generateMatrix(int n) {
        int left = 0, top = 0;
        int right = n - 1, bottom = n - 1;
        int[][] result = new int[n][n];
        int num = 1;
        int end = n * n;

        while (num <= end) {
            for (int j = left; j <= right; j++) {
                result[top][j] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;
            for (int j = right; j >= left; j--) {
                result[bottom][j] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = num++;
            }
            left++;
        }
        return result;
    }
}
