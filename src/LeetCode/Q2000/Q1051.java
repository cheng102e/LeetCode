package LeetCode.Q2000;

import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/1 22:07
 */
public class Q1051 {

  public static int heightChecker(int[] heights) {
    int[] other = heights.clone();
    Arrays.sort(other);
    int ans = 0;
    for (int i = 0; i < heights.length; i++) {
      if (other[i] != heights[i]) {
        ans++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

}
