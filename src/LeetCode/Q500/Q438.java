package LeetCode.Q500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/7 11:32
 */
public class Q438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> window = new HashMap();
        Map<Character, Integer> need = new HashMap();
        int plen = p.length();
        int slen = s.length();
        for (int i = 0; i < plen; i++) {
            char c = p.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < slen) {
            char addch = s.charAt(right);
            window.put(addch, window.getOrDefault(addch, 0) + 1);
            right++;
            if (need.containsKey(addch) && window.get(addch).equals(need.get(addch))) {
                valid++;
                if (valid == need.size()) {
                    ans.add(left);
                }
            }
            while (right - left >= plen) {
                char rech = s.charAt(left);
                left++;
                if (need.containsKey(rech)) {

                    if (window.get(rech).equals(need.get(rech))) {
                        valid--;
                    }window.put(rech, window.get(rech) - 1);
                }
            }
        }
        return ans;
    }

}
