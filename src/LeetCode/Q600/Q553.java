package LeetCode.Q600;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/2 14:04
 */
public class Q553 {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        String ans = String.valueOf(nums[0]);
        if (n == 1) {
            return ans;
        }
        if (n == 2) {
            return ans + "/" + String.valueOf(nums[1]);
        }
        ans += "/(";
        for (int i = 1; i < n; i++) {
            ans += String.valueOf(nums[i]);
            if (i != n - 1) {
                ans += "/";
            } else {
                ans += ")";
            }
        }

        return ans.toString();
    }
}
