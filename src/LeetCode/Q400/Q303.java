package LeetCode.Q400;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 17:11
 */
public class Q303 {
    private int[] preSum;

    public void NumArray(int[] nums) {

        int n = nums.length;

        preSum = new int[n + 1];
        //第i位之前的和，不包括第i位

        for (int i = 1; i <= n; i++) {
            preSum[i] = nums[i - 1] + preSum[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return preSum[j + 1] - preSum[i];
    }
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
