package LeetCode;

import java.util.HashMap;

public class Q2006 {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num+k)){
                ans += map.get(num + k);
            }
            if(map.containsKey(num-k)){
                ans += map.get(num - k);
            }
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        return ans;
    }
}
