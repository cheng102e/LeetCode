package todo.Back;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        backTrack(sb, n, 1, 0);
        return result;
    }

    public static void backTrack(StringBuilder sb, int n, int left, int right) {
        if (sb.length() == 2 * n && left == right) {
            result.add(sb.toString());
            return;
        }
        if (left < n) {
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.append('(');
            backTrack(sb1, n, left + 1, right);
        }
        if (left > right && right < n) {
            StringBuilder sb2 = new StringBuilder(sb);
            sb2.append(')');
            backTrack(sb2, n, left, right + 1);
        }
    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
