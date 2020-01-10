/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/10 20:48
 */
public class Q41 {

  private static void swap(int nums[], int a, int b) {
    int c = nums[a];
    nums[a] = nums[b];
    nums[b] = c;
  }

  public static int firstMissingPositive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 1;
    }
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
        swap(nums, i, nums[i] - 1);
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
