package todo.Queue;

import java.util.HashSet;
import java.util.Stack;

public class Q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        for (String token : tokens) {
            if (set.contains(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if ("+".equals(token)) {
                    stack.push(num1 + num2);
                } else if ("-".equals(token)) {
                    stack.push(num1 - num2);
                } else if ("*".equals(token)) {
                    stack.push(num1 * num2);
                } else if ("/".equals(token)) {
                    stack.push(num1 / num2);
                }
            } else {
                stack.add(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
