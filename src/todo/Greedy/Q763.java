package todo.Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q763 {
    public List<Integer> partitionLabels(String s) {
        char[] chs = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int n = chs.length;
        for (int i = 0; i < n; i++) {
            map.put(chs[i], i);
        }
        int start = 0;
        int end = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            end = Math.max(map.get(chs[i]), end);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
