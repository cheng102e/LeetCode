package LeetCode.Q1000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/28 19:47
 */
public class Q844 {
    public boolean backspaceCompare(String s, String t) {
        if (get(s).equals(get(t))) {
            return true;
        }
        return false;
    }

    public String get(String s) {
        char[] ch = s.toCharArray();
        int tag = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '#') {
                if (tag > 0) {
                    tag--;
                }
            } else {
                ch[tag] = ch[i];
                tag++;
            }
        }
        StringBuffer ss = new StringBuffer();
        for (int i = 0; i < tag; i++) {
            ss.append(ch[i]);
        }
        return ss.toString();
    }
}
