package LeetCode.Q200;

import java.util.HashSet;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        // set去重
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = 0;
        for (int num : set) {
            // 如果有前一个数，则代表该数并非序列中最前一个数
            if (set.contains(num - 1)) {
                continue;
            } else {
                int len = 1;
                while (set.contains(++num)) {
                    len++;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
