package todo.Back;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Q131 {

    static HashMap<String, Boolean> map = new HashMap<String, Boolean>();
    static List<List<String>> result = new ArrayList<List<String>>();
    static LinkedList<String> path = new LinkedList<String>();

    public static boolean isPartition(String s) {
        if (map.containsKey(s)) {
            return map.get(s);
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                map.put(s, false);
                return false;
            }
            left++;
            right--;
        }
        map.put(s, true);
        return true;
    }

    public static List<List<String>> partition(String s) {
        back(s, 0);
        return result;
    }

    public static void back(String s, int index) {
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            if (!isPartition(s.substring(index, i))) {
                continue;
            }
            path.add(s.substring(index, i));
            back(s, i);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        partition("aab");
    }
}
