package todo.Map;

import java.util.HashMap;

public class Q387 {
    public int firstUniqChar(String s) {
        char[] chs = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chs) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chs.length; i++) {
            if (map.get(chs[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
