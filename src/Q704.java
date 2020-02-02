/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 17:13
 */
public class Q704 {

  public static int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
