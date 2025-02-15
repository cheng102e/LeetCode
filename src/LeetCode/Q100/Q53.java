package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 20:34
 */
public class Q53 {

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum >= 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
