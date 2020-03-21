package Test;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */


public class AT {

  public static int search(int i, int j, int n, int m, int[][] hill, int[][] flag, int min) {
    if (i == 0 || i == n || j == 0 || j == m) {
      return 0;
    }
    int a = hill[i + 1][j];
    int b = hill[i - 1][j];
    int c = hill[i][j + 1];
    int d = hill[i][j - 1];
    return search(i + 1, j, n, m, hill, flag, min) + search(i - 1, j, n, m, hill, flag, min)
        + search(i, j + 1, n, m, hill, flag, min) + search(i, j - 1, n, m, hill, flag, min);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] hill = new int[n][m];
    int[][] flag = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        hill[i][j] = in.nextInt();
      }
    }
    int count = 0;
    search(n / 2, m / 2, n, m, hill, flag, 0);
    System.out.print(count);
  }
}
