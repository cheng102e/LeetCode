package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/8 20:31
 */
public class Q283 {

    public static void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}
