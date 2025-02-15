package todo.Greedy;

import java.util.Arrays;

public class Q455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int index = s.length - 1;
        // 孩子胃口倒序
        for (int i = g.length - 1; i >= 0; i--) {
            if (index >= 0 && s[index] >= g[i]) {
                result++;
                index--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
    }
}
