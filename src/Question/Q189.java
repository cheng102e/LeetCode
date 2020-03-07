package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/31 11:28
 */
public class Q189 {

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static void rotate(int[] nums, int k) {
    int len = nums.length;
    k = k % len;
    reverse(nums, 0, len - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, len - 1);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
