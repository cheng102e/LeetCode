package todo.Monotony;

import java.util.Deque;
import java.util.LinkedList;

public class Q739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        // 栈中存index
        stack.push(0);
        for (int i = 1; i < n; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int top = stack.poll();
                    result[top] = i - top;
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.poll();
            result[top] = 0;
        }
        return result;
    }
}
