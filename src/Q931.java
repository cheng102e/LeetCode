public class Q931 {

  public static int minFallingPathSum(int[][] A) {
    int min = 9999;
    int len = A.length;
    for (int i = 1; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (j == 0) {
          A[i][j] = A[i][j] + Math.min(A[i - 1][j], A[i - 1][j + 1]);
        } else if (j == len - 1) {
          A[i][j] = A[i][j] + Math.min(A[i - 1][j], A[i - 1][j - 1]);
        } else {
          A[i][j] = A[i][j] + Math.min(A[i - 1][j], Math.min(A[i - 1][j - 1], A[i - 1][j + 1]));
        }
      }
    }
    for (int i = 0; i < len; i++) {
      if (min > A[len - 1][i]) {
        min = A[len - 1][i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
