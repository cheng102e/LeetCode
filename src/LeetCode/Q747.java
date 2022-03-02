package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 11:47
 */
public class Q747 {

    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int max = 0;
        int second = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[max]) {
                second = max;
                max = i;
            } else if ((second == -1) || (nums[i] > nums[second])) {
                second = i;
            }
        }
        if (nums[max] >= nums[second] * 2) {
            return max;
        } else {
            return -1;
        }
    }
}
