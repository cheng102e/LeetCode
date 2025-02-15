package todo.Array;

public class Q289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        // 0 死 1 活 2 即将复活 3 即将死亡
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                change(board, i, j, m, n);
            }
        }
        update(board, m, n);
    }

    void update(int[][] board, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }
    }

    void change(int[][] board, int x, int y, int m, int n) {
        int alive = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || i >= m || j < 0 || j >= n || (i == x && j == y)) {
                    continue;
                }
                if (board[i][j] == 1 || board[i][j] == 3) {
                    alive++;
                }
            }
        }
        if (board[x][y] == 1) {
            if (alive < 2 || alive > 3) {
                board[x][y] = 3;
            }
        } else {
            if (alive == 3) {
                board[x][y] = 2;
            }
        }
    }
}
