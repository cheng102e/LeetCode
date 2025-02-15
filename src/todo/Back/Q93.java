package todo.Back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q93 {

    List<String> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        back(s, 0, 0);
        return result;
    }

    public Boolean isValid(String s) {
        if ("0".equals(s)) {
            return true;
        }
        int value = Integer.parseInt(s);
        return value <= 255 && s.charAt(0) != '0';
    }

    public void buildIP() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(path.get(i));
            if (i != 3) {
                sb.append(".");
            }
        }
        result.add(sb.toString());
    }

    public void back(String s, int index, int count) {
        if (count == 4 && index == s.length()) {
            buildIP();
            return;
        }
        for (int i = index + 1; i <= s.length() && i - index < 4; i++) {
            if (!isValid(s.substring(index, i))) {
                continue;
            }
            path.add(s.substring(index, i));
            back(s, i, count + 1);
            path.removeLast();
        }
    }

}
