package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/16 14:17
 */
public class Q11 {

  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int max = 0;
    while (left < right) {
      max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
