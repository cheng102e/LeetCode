package LeetCode.Q2000;

public class Q1189 {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                b++;
            } else if (ch == 'a') {
                a++;
            } else if (ch == 'l') {
                l++;
            } else if (ch == 'o') {
                o++;
            } else if (ch == 'n') {
                n++;
            }
        }
        l = l / 2;
        o = o / 2;
        int ans = Math.min(Math.min(Math.min(b, a), l), Math.min(o, n));
        return ans;
    }
}