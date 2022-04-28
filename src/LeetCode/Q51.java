package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q51 {
    static List<List<String>> ans = new ArrayList<>();
    static int[] queen;

    public static List<List<String>> solveNQueens(int n) {
        queen = new int[n];
        place(0, n);
        return ans;
    }

    public static List<String> getans(int n) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuffer s = new StringBuffer();
            for (int j = 0; j < queen[i]; j++) {
                s.append(".");
            }
            s.append("Q");
            for (int j = queen[i] + 1; j < n; j++) {
                s.append(".");
            }
            tmp.add(s.toString());
        }
        return tmp;
    }

    public static void place(int t, int n) {
        if (t == n) {
            ans.add(getans(n));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (check(t, i, n)) {
                queen[t] = i;
                place(t + 1, n);
                queen[t] = 0;
            }
        }
    }

    public static boolean check(int t, int x, int n) {
        for (int i = 0; i < t; i++) {
            if (queen[i] == x || queen[i] == x - t + i || queen[i] == x + t - i) {
                return false;
            }
        }
        return true;
    }
}
