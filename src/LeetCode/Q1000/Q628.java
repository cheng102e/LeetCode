package LeetCode.Q1000;

import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2019/12/28 16:27
 */
public class Q628 {

  public static int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int max1 = nums[0] * nums[1] * nums[nums.length - 1];
    int max2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];

    return Math.max(max1, max2);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
