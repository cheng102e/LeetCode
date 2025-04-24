package LeetCode.Q100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 存放排序后的字符串，和初始字符串列表
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String key = String.copyValueOf(chs);
            // 每次直接更新列表
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
