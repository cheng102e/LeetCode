package LeetCode.Q300;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 17:31
 */
public class Q213 {

  public int rob(int[] nums) {
    int[] dp_0 = new int[nums.length];
    int[] dp_1 = new int[nums.length];
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    dp_0[0] = nums[0];
    dp_0[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length - 1; i++) {
      dp_0[i] = Math.max(dp_0[i - 1], dp_0[i - 2] + nums[i]);
    }
    dp_1[1] = nums[1];
    dp_1[2] = Math.max(nums[1], nums[2]);
    for (int i = 3; i < nums.length; i++) {
      dp_1[i] = Math.max(dp_1[i - 1], dp_1[i - 2] + nums[i]);
    }
    return Math.max(dp_0[nums.length - 2], dp_1[nums.length - 1]);
  }
}
