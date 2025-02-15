package LeetCode.Q100;

import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 22:08
 */
public class Q20 {

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
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.peek() != match(c)) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

}
