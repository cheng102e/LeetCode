package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/17 19:31
 */
public class Q3 {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int len = s.length();
        int left = 0, right = 0;
        int ans = 0;
        while (right < len) {
            char ch = s.charAt(right);
            right++;
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            while (window.get(ch) > 1) {
                char remove = s.charAt(left);
                left++;
                window.put(remove, window.get(remove) - 1);
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
