package LeetCode.Q600;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/7 11:32
 */
public class Q567 {
    public static boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> window = new HashMap();
        Map<Character, Integer> need = new HashMap();
        int s1len = s1.length();
        int s2len = s2.length();
        for (int i = 0; i < s1len; i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < s2len) {
            char addch = s2.charAt(right);
            window.put(addch, window.getOrDefault(addch, 0) + 1);
            right++;
            if (need.containsKey(addch) && window.get(addch).equals(need.get(addch))) {
                valid++;
                if (valid == need.size()) {
                    return true;
                }
            }
            while (right - left >= s1len) {
                char rech = s2.charAt(left);
                left++;
                if (need.containsKey(rech)) {

                    if (window.get(rech).equals(need.get(rech))) {
                        valid--;
                    }window.put(rech, window.get(rech) - 1);
                }
            }
        }
        return false;
    }

}
