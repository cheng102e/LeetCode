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
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character, Integer> window = new HashMap();
        Map<Character, Integer> need = new HashMap();
        int slen = s.length(), tlen = t.length();
        for (int i = 0; i < tlen; i++) {
            char c = tc[i];
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int valid = 0;
        int start = 0, len = tlen + slen + 1;
        for (int i = 0; i < slen; i++) {
            char addch = sc[i];
            window.put(addch, window.getOrDefault(addch, 0) + 1);
            if (need.containsKey(addch) && window.get(addch).equals(need.get(addch))) {
                valid++;
            }

            while (valid == need.size()) {
                if (i - left + 1 < len) {
                    start = left;
                    len = i - left + 1;
                }
                char tmp = sc[left];
                if (need.containsKey(tmp) && window.get(tmp).equals(need.get(tmp))) {
                    valid--;
                }
                window.put(tmp, window.get(tmp) - 1);
                left++;
            }
        }
        if (len == tlen + slen + 1) {
            return "";
        } else {
            return s.substring(start, start + len);
        }
    }

}
