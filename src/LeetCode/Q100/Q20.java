package LeetCode.Q100;

import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 22:08
 */
public class Q20 {

    // 返回对应括号
    public char match(char c) {
        if (c == ')') {
            return '(';
        }
        if (c == '}') {
            return '{';
        }
        if (c == ']') {
            return '[';
        }
        return c;
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        for (char c : chs) {
            // 左括号入栈，右括号对应匹配
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.peek() != match(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}
