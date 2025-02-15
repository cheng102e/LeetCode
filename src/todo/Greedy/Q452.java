package todo.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Q452 {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                } else if (o1[0] < o2[0]) {
                    return -1;
                } else if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                }
                return 0;
            }
        });
        int sum = 1;
        int left = points[0][0];
        int right = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]  <= right) {
                left = Math.max(left, points[i][0]);
                right = Math.min(right,points[i][1]);
            }else {
                sum++;
                left = points[i][0];
                right = points[i][1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        findMinArrowShots(new int[][]{{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}});
    }
}
