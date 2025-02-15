package todo.Array;

public class Q283 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums, int l, int r) {
        int num = nums[l];
        nums[l] = nums[r];
        nums[r] = num;
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1,0,1,0,3,12});
    }
}
