package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q1748 {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                ans += nums[i];
                map.put(nums[i], 1);
            } else if (map.get(nums[i]) == 1) {
                ans -= nums[i];
                map.put(nums[i], 2);
            }
        }
        return ans;
    }
}
