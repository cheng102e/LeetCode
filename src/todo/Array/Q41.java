package todo.Array;

public class Q41 {
    public static void main(String[] args) {
        firstMissingPositive(new int[]{1, 1});
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n+1;
    }

    public static void swap(int[] nums, int l, int r) {
        int num = nums[l];
        nums[l] = nums[r];
        nums[r] = num;
    }
}
