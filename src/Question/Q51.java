package Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q51 {

  private static boolean col[];
  private static boolean line1[];
  private static boolean line2[];
  private static int answer[];
  private static List<List<String>> res = new LinkedList<>();

  public static List<List<String>> solveNQueens(int n) {
    col = new boolean[n];
    line1 = new boolean[2 * n - 1];
    line2 = new boolean[2 * n - 1];
    answer = new int[n];
    res.clear();
    putQueen(n, 0);
    return res;
  }

  private static void putQueen(int n, int index) {
    if (index == n) {
      List<String> item = new ArrayList<String>();
      for (int i = 0; i < answer.length; i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < answer.length; j++) {
          if (answer[i] != j) {
            sb.append('.');
          } else {
            sb.append('Q');
          }
        }
        item.add(sb.toString());
      }
      res.add(item);
    }

    for (int i = 0; i < n; i++) {
      if (!col[i] && !line1[i - index + n - 1] && !line2[i + index]) {
        answer[index] = i;
        col[i] = true;
        line1[i - index + n - 1] = true;
        line2[i + index] = true;

        col[i] = false;
        line1[i - index + n - 1] = false;
        line2[i + index] = false;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
