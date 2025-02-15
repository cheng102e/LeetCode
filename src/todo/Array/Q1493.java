package todo.Array;

public class Q1493 {
    public static void main(String[] args) {
        longestSubarray(new int[]{1, 1, 1});
    }

    public static int longestSubarray(int[] nums) {
        int zero = nums[0] == 0 ? 1 : 0;
        int one = 1 - zero;
        int left = 0;
        int max = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == 1) {
                one++;
            } else {
                zero++;
                while (zero > 1) {
                    if (nums[left++] == 0) {
                        zero--;
                    } else {
                        one--;
                    }
                }
            }
            max = Math.max(max, one + zero -1);
        }
        return max;
    }
}
