package todo.Array;

public class Q643 {
    public static void main(String[] args) {
        findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
    }

    public static double findMaxAverage(int[] nums, int k) {
        // 前缀和
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int max = nums[k - 1];
        for (int i = k; i < nums.length; i++) {
            int sum = nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }
}
