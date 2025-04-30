package LeetCode.Q600;

import java.util.HashMap;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/5 9:13
 */
public class Q560 {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        // 表示前缀和
        int sum = 0;
        for (int num : nums) {
            sum += num;
            // sum - (sum - k) = k
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
