package LeetCode.Q3000;

public class Q2016 {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int ans = -1;
        int min = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > min) {
                ans = Math.min(ans, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        return ans;
    }
}