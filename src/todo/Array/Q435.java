package todo.Array;

import java.util.Arrays;
import java.util.Comparator;

public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        // 贪心
        // 按照右端点排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int n = intervals.length;
        int count = 1;

        int right = intervals[0][1];
        for (int i = 1; i < n; i++) {
            // 若可完美拼接，就更新右端点，可连接区间+1
            if (intervals[i][0] >= right) {
                count++;
                right = intervals[i][1];
            }
        }
        return n - count;
    }
}
