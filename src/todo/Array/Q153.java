package todo.Array;

public class Q153 {
    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (right - left <= 1) {
                return Math.min(nums[right], nums[left]);
            }
            int mid = left + (1 + right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                if (nums[left] > nums[right]) {
                    left = mid;
                }
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        findMin(new int[]{11, 13, 15, 17});
    }
}
