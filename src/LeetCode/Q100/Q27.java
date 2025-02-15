package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:37
 */
public class Q27 {

    public static int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow + 1;
    }
}
