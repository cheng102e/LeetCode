package LeetCode.Q300;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/17 19:31
 */
public class Q209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= target) {
                min = Math.min(min, i - left + 1);
            }
            while (sum - nums[left] >= target) {
                sum -= nums[left++];
                min = Math.min(min, i - left + 1);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

}
