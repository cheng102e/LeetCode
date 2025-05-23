package LeetCode.Q300;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:28
 */
public class Q264 {

  public static int nthUglyNumber(int n) {
    int[] ans = new int[n];
    int n2 = 0, n3 = 0, n5 = 0;
    ans[0] = 1;
    for (int i = 1; i < n; i++) {
      int min = Math.min(ans[n2] * 2, Math.min(ans[n3] * 3, ans[n5] * 5));
      ans[i] = min;
      if (min == ans[n2] * 2) {
        n2++;
      }
      if (min == ans[n3] * 3) {
        n3++;
      }
      if (min == ans[n5] * 5) {
        n5++;
      }

    }
    return ans[n - 1];
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
