package todo.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Q394 {

    public static void main(String[] args) {
        decodeString("10[lc]");
    }

    public static String decodeString(String s) {
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int index = 0;
        do {
            char ch = chs[index++];
            if (ch == ']') {
                Deque<Character> deque = new LinkedList<>();
                char tmp = stack.pop();
                while (tmp != '[') {
                    deque.offerFirst(tmp);
                    tmp = stack.pop();
                }
                StringBuilder sb = new StringBuilder(String.valueOf(stack.pop()));
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    sb.append(stack.pop());
                }
                String range = sb.reverse().toString();
                for (int i = 0; i < Integer.parseInt(range); i++) {
                    for (char code : deque) {
                        stack.push(code);
                    }
                }

            } else {
                stack.push(ch);
            }
            if (index == s.length()) {
                break;
            }
        } while (!stack.isEmpty());
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
