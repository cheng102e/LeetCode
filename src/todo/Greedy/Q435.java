package todo.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            } else {
                // 不重复的
                count++;
            }
        }
        return intervals.length - count;
    }
}
