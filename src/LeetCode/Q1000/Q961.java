package LeetCode.Q1000;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 9:51
 */
public class Q961 {

  public static int repeatedNTimes(int[] A) {
    int len = A.length;
    for (int i = 0; i < len - 2; i++) {
      if (A[i] == A[i + 1] || A[i] == A[i + 2]) {
        return A[i];
      }
    }
    return A[len - 1];
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
