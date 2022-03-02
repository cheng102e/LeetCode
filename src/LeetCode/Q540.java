package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/2 9:58
 */
public class Q540 {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (r - l) / 2 + l;
            if (m % 2 == 1) {
                m--;
            }
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
