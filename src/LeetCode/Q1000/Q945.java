package LeetCode.Q1000;

import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-22 9:48
 */
public class Q945 {

  public int minIncrementForUnique(int[] A) {
    Arrays.sort(A);
    int count = 0;
    for (int i = 1; i < A.length; i++) {
      if (A[i] <= A[i - 1]) {
        count += A[i - 1] - A[i] + 1;
        A[i] = A[i - 1] + 1;
      }
    }
    return count;
  }
}
