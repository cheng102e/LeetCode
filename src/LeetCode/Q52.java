package LeetCode;

import java.util.HashSet;

public class Q52 {
    HashSet<String> ans = new HashSet<>();
    int[] queen;

    public int totalNQueens(int n) {
        queen = new int[n];
        place(0, n);
        return ans.size();
    }

    public String getans(int n) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < n; i++) {
            s.append(queen[i]);
        }
        return s.toString();
    }

    public void place(int t, int n) {
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

    public boolean check(int t, int x, int n) {
        for (int i = 0; i < t; i++) {
            if (queen[i] == x || queen[i] == x - t + i || queen[i] == x + t - i) {
                return false;
            }
        }
        return true;
    }
}
