package LeetCode;

import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/25 15:40
 */
public class Q921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int count = 0;
        int need = 0;
        for (char c : ch) {
            if (c == '(') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    need++;
                }
            }
        }
        need += count;
        return need;
    }
}
