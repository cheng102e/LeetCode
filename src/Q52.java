public class Q52 {

  //列
  private static boolean col[];

  //正对角线 x-y+n-1
  private static boolean line1[];

  //斜对角线 x+y
  private static boolean line2[];

  public static int totalNQueens(int n) {
    col = new boolean[n];
    line1 = new boolean[2 * n - 1];
    line2 = new boolean[2 * n - 1];
    return putQueen(n, 0);
  }

  private static int putQueen(int n, int index) {
    int flag = 0;
    if (index == n) {
      return 1;
    }

    for (int i = 0; i < n; i++) {
      if (!col[i] && !line1[i - index + n - 1] && !line2[i + index]) {

        col[i] = true;
        line1[i - index + n - 1] = true;
        line2[i + index] = true;
        flag = flag + putQueen(n, index + 1);

        col[i] = false;
        line1[i - index + n - 1] = false;
        line2[i + index] = false;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
