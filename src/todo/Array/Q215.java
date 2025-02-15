package todo.Array;

import java.util.PriorityQueue;

public class Q215 {
    public int findKthLargest(int[] nums, int k) {
        // 默认小根堆，节点小于子节点
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (queue.peek() < nums[i]) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }

}
