package todo.Array;

public class Q33 {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            int mid = left + (1 + right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] <= nums[right]) {
                // 代表右侧有序,为增
                if (nums[right] >= target && nums[mid] < target) {
                    // 进入右侧有序
                    left = mid + 1;
                } else {
                    // 进入左侧无序
                    right = mid - 1;
                }
            } else if (nums[mid] > nums[left]) {
                // 左侧有序
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }
}
