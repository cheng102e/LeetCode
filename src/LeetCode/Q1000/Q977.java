package LeetCode.Q1000;

public class Q977 {

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int tag = nums.length - 1;
        int [] ans = new int[nums.length];
        while (left <= right) {
            int i = nums[left] * nums[left];
            int j = nums[right] * nums[right];
            if (i <= j) {
                ans[tag--] = j;
                right--;
            } else {
                ans[tag--] = i;
                left++;
            }
        }
        return ans;
    }

}
