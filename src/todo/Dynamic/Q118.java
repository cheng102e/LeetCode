package todo.Dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q118 {
    public static List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
            List<Integer> list = IntStream.of(dp[i]).limit(i+1).boxed().collect(Collectors.toList());
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
