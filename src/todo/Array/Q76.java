package todo.Array;

import java.util.HashMap;
import java.util.Map;

public class Q76 {
    public String minWindow(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        for (char c : cht) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        for (int right = 0; right < s.length(); right++) {
            int count = maps.getOrDefault(chs[right], 0) + 1;
            maps.put(chs[right], count);
            while (check(maps, mapt)) {
                // 已包含，则缩短
                int len = right - left;
                if (len < minLen) {
                    minLen = len;
                    minStart = left;
                }
                maps.put(chs[left], maps.getOrDefault(chs[left], 0) - 1);
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen + 1);
    }

    public boolean check(HashMap<Character, Integer> maps, HashMap<Character, Integer> mapt) {
        for (Map.Entry<Character, Integer> entry : mapt.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (maps.getOrDefault(c, 0) < count) {
                return false;
            }
        }
        return true;
    }
}
