package todo.Back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q51 {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c, '.');
        }
        back(0, n, chessboard);
        return result;
    }

    public void back(int x, int n, char[][] chessboard) {
        if (x == n) {
            buildResult(chessboard);
            return;
        }
        for (int y = 0; y < n; y++) {
            if (!isValid(x, y, n, chessboard)) {
                continue;
            }
            chessboard[x][y] = 'Q';
            back(x + 1, n, chessboard);
            chessboard[x][y] = '.';

        }
    }

    public boolean isValid(int x, int y, int n, char[][] chessboard) {
        for (int i = 0; i < x; i++) {
            if (chessboard[i][y] == 'Q') {
                return false;
            }
        }
//        for (int i = 0; i < y; i++) {
//            if (chessboard[x][i] == 'Q' ) {
//                return false;
//            }
//        }
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = x - 1, j = y + 1; i >= 0 && j <= n - 1; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void buildResult(char[][] chessboard) {
        List<String> row = new ArrayList<>();
        for (char[] c : chessboard) {
            row.add(String.valueOf(c));
        }
        result.add(row);
    }
}
