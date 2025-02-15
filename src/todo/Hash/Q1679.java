package todo.Hash;

import java.util.HashMap;

public class Q1679 {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = k - nums[i];
            int count = map.getOrDefault(target, 0);
            if (count > 0) {
                map.put(target, count - 1);
                sum++;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return sum;
    }
}
