package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/3 13:11
 */
public class Q35 {

  public static int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return 0;
    }
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
