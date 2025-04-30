package LeetCode.Q100;

import java.util.HashSet;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/17 19:31
 */
public class Q3 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }
        char[] chs = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            char c = chs[right];
            // 如果已经包含，则从左边删除，直至不重复
            while (set.contains(c)) {
                set.remove(chs[left++]);
            }
            // 此时加上c，又是一个不含重复字符的字串
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
