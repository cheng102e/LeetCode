package LeetCode.Q100;

import java.util.HashMap;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        // 借助map进行存储，存储数据和位置
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 对每个数查找所需数对，存在则返回，不存在则继续
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
