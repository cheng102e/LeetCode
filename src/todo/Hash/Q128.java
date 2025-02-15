package todo.Hash;

import java.util.HashSet;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            } else {
                int len = 1;
                while (set.contains(++num)) {
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
