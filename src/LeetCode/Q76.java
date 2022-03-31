package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/6 22:55
 */
public class Q76 {
    public static String minWindow(String s, String t) {

        Map<Character, Integer> window = new HashMap();
        Map<Character, Integer> need = new HashMap();
        int slen = s.length(), tlen = t.length();
        for (int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = tlen+slen + 1;
        while (right < slen) {
            char addch = s.charAt(right);
            window.put(addch, window.getOrDefault(addch, 0) + 1);
            right++;

            if (need.containsKey(addch) && window.get(addch).equals(need.get(addch))) {
                valid++;
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char rech = s.charAt(left);
                if (need.containsKey(rech) && window.get(rech).equals(need.get(rech))) {
                    valid--;
                }
                window.put(rech, window.get(rech) - 1);
                left++;
            }
        }
        return len == tlen+slen + 1 ? "" : s.substring(start, start + len);
    }

}
