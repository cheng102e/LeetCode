package LeetCode.Q300;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/8 20:31
 */
public class Q283 {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // left 前的均不为0
        int left = 0;
        for (int right = 0; right < n; right++) {
            // 将非0移动到前面，移动完后自然只剩0
            if (nums[right] != 0) {
                swap(nums, left++, right);
            }
        }

    }

    public void swap(int[] nums, int l, int r) {
        int num = nums[l];
        nums[l] = nums[r];
        nums[r] = num;
    }

}
