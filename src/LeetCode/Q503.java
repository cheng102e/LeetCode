package LeetCode;

import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/25 20:40
 */
public class Q503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            stack.push(nums[i]);
        }
        int[] ans = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek();
            } else {
                ans[i] = -1;
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
