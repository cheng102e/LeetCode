package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 20:34
 */
public class Q53 {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        // 直接获取最大值
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(sum, max);
        }
        return max;
    }
}
