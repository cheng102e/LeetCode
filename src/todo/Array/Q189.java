package todo.Array;

public class Q189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        swap(nums, 0, n - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, n - 1);
    }

    public void swap(int[] nums, int l, int r) {
        if (r < 0 || r >= nums.length) {
            return;
        }
        while (l < r) {
            int num = nums[l];
            nums[l] = nums[r];
            nums[r] = num;
            l++;
            r--;
        }
    }
}
