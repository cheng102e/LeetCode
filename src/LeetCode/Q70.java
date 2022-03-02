package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2019/12/28 18:19
 */
public class Q70 {

  public int climbStairs(int n) {
    if (n < 3) {
      return n;
    }
    int f1 = 1;
    int f2 = 2;
    int fn = 0;
    for (int i = 3; i <= n; i++) {
      fn = f1 + f2;
      f1 = f2;
      f2 = fn;
    }
    return fn;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
