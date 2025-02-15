package todo.Code;

import java.util.HashMap;
import java.util.Map;

public class Q409 {
    public int longestPalindrome(String s) {
        char[] chs = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chs) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int sum = 0;
        boolean odd = false;
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            int value = item.getValue();
            if (value % 2 == 0) {
                sum += value;
            } else {
                odd = true;
                sum += value - 1;
            }
        }
        return sum + (odd ? 1 : 0);
    }
}
