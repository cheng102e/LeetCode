package LeetCode.Q1000;

import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/26 8:49
 */
public class Q682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String op : ops) {
            if (op.equals("+")) {
                int x = stack.pop();
                int y = stack.peek();
                sum += x + y;
                stack.push(x);
                stack.push(x + y);
            } else if (op.equals("C")) {
                sum -= stack.pop();
            } else if (op.equals("D")) {
                sum += stack.peek() * 2;
                stack.push(stack.peek() * 2);
            } else {
                int num = Integer.valueOf(op);
                stack.push(num);
                sum += num;
            }
        }
        return sum;
    }
}
