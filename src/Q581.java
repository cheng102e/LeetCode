/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/12 10:43
 */
public class Q581 {

  public int findUnsortedSubarray(int[] nums) {
    int len = nums.length;
    int max = nums[0];
    int min = nums[len - 1];
    int left = 0, right = -1;
    for (int i = 0; i < len; i++) {
      if (max > nums[i]) {
        right = i;
      } else {
        max = nums[i];
      }
    }
    for (int i = len - 1; i > -1; i--) {
      if (min < nums[i]) {
        left = i;
      } else {
        min = nums[i];
      }
    }
    return right - left + 1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
