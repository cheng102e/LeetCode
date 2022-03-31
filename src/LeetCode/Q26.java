package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:37
 */
public class Q26 {

    public static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

}
