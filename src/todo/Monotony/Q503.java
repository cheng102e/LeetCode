package todo.Monotony;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Q503 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1; i < 2 * n; i++) {
            if (nums[i % n] <= nums[stack.peek()]) {
                stack.push(i % n);
            } else {
                while (!stack.isEmpty() && nums[i % n] > nums[stack.peek()]) {
                    int top = stack.poll();
                    result[top] = nums[i % n];
                }
                stack.push(i % n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        nextGreaterElements(new int[]{1, 2, 1});
    }
}
