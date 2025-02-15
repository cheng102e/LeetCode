package todo.Monotony;

import java.util.Deque;
import java.util.LinkedList;

public class Q42 {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        if (n <= 2) {
            return sum;
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            if (height[i] < height[stack.peek()]) {
                stack.push(i);
            } else if (height[i] == height[stack.peek()]) {
                stack.poll();
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int mid = stack.poll();
                    if (!stack.isEmpty()) {
                        int h = Math.min(height[stack.peek()], height[i]) - height[mid];
                        int w = i - stack.peek() - 1;
                        sum += h * w;
                    }
                }
                stack.push(i);
            }
        }
        return sum;
    }
}
