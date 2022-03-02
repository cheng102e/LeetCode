package LeetCode;

import java.util.List;

public class Q539 {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 1440) {
            return 0;
        }
        int[] day = new int[1440 * 2 + 10];
        for (String s : timePoints) {
            String[] time = s.split(":");
            int minute = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            day[minute]++;
            day[minute + 1440]++;
        }

        int ans = 1440, last_1 = -1;
        for (int i = 0; i < 2880; i++) {
            if (day[i] == 0) {
                continue;
            }
            if (day[i] > 1) {
                ans = 0;
                return ans;
            } else if (last_1 != -1) { // now the day[i] = 1
                ans = Math.min(ans, i - last_1);
            }
            last_1 = i;
        }
        return ans;
    }
}
