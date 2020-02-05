import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/5 11:06
 */
public class Q976 {

  public static int largestPerimeter(int[] A) {
    Arrays.sort(A);
    for (int i = A.length - 1; i > 1; i--) {
      if (A[i] < A[i - 1] + A[i - 2]) {
        return A[i] + A[i - 1] + A[i - 2];
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
