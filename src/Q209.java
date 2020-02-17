import java.util.HashMap;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/17 19:31
 */
public class Q209 {

  public int minSubArrayLen(int s, int[] nums) {
    int len = nums.length;
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int left = 0;
    for (int right = 0; right < len; right++) {
      sum += nums[right];
      while (sum >= s) {
        min = Math.min(min, right - left + 1);
        sum -= nums[left];
        left++;
      }
    }
    if(min== Integer.MAX_VALUE){
      return 0;
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
