package todo.Array;

public class Q1004 {
    public int longestOnes(int[] nums, int k) {
        // 滑动数组，计算中间的数的长度
        int zero = nums[0] == 0 ? 1 : 0;
        int one = 1 - zero;
        int left = 0;
        int max = one == 1 || k > 0 ? 1 : 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == 1) {
                one++;
            } else {
                zero++;
            }
            while (zero > k) {
                if (nums[left++] == 0) {
                    zero--;
                } else {
                    one--;
                }
            }
            max = Math.max(max, one + zero);
        }
        return max;
    }
}
