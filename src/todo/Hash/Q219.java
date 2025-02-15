package todo.Hash;

import java.util.HashMap;

public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i - map.getOrDefault(num, -k - 1) <= k) {
                return true;
            } else {
                map.put(num, i);
            }
        }
        return false;
    }
}
