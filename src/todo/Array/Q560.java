package todo.Array;

import java.util.HashMap;

public class Q560 {
    public static void main(String[] args) {
        subarraySum(new int[]{1, 1, 1}, 2);
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int pre = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            int need = pre - k;
            result += map.getOrDefault(need, 0);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return result;
    }
}
