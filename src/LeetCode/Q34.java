package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/10 10:26
 */
public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int left1 = 0, left2 = 0;
        int right1 = nums.length - 1, right2 = nums.length - 1;
        while (left1 <= right1) {
            int mid = left1 + (right1 - left1) / 2;
            if (nums[mid] < target) {
                left1 = mid + 1;
            } else if (nums[mid] > target) {
                right1 = mid - 1;
            } else if (nums[mid] == target) {
                right1 = mid - 1;
            }
        }

        ans[0] = left1;

        while (left2 <= right2) {
            int mid = left2 + (right2 - left2) / 2;
            if (nums[mid] < target) {
                left2 = mid + 1;
            } else if (nums[mid] > target) {
                right2 = mid - 1;
            } else if (nums[mid] == target) {
                left2 = mid + 1;
            }
        }
        ans[1] = right2;

        if (left1 >= nums.length || nums[left1] != target || right2 < 0 || nums[right2] != target) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        return ans;
    }
}
