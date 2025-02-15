package todo.Code;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q2462 {
    public long totalCost(int[] costs, int k, int candidates) {

        int n = costs.length;
        long ans = 0;
        if (candidates * 2 >= n) {
            Arrays.sort(costs);
            for (int i = 0; i < k; ++i) {
                ans += costs[i];
            }
            return ans;
        }


        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        // 花费，序号
        for (int i = 0; i < candidates; ++i) {
            pq.offer(new int[]{costs[i], i});
            pq.offer(new int[]{costs[n - i - 1], n - i - 1});
        }
        int l = candidates, r = n - candidates - 1;
        // 进行 k 次操作
        while (k-- > 0) {
            int[] p = pq.poll();
            ans += p[0];
            // 如果左右指针相遇，说明已经遍历完中间部分元素，继续下一次循环
            if (l > r) {
                continue;
            }
            // 如果取出元素来自左边部分
            if (p[1] < l) {
                pq.offer(new int[]{costs[l], l++});
            } else {
                pq.offer(new int[]{costs[r], r--});
            }
        }

        return ans;
    }

}
