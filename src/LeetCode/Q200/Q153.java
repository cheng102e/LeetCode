package LeetCode.Q200;

public class Q153 {

  public static int findMin(int[] nums) {
    int head = 0;
    int tail = nums.length - 1;
    int mid = (head + tail) / 2;
    while (true) {
      if (tail - head < 2) {
        break;
      }
      if (nums[mid] < nums[tail]) {
        tail = mid;
      } else {
        head = mid;
      }
      mid = (head + tail) / 2;
    }
    return Math.min(nums[head], nums[tail]);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
