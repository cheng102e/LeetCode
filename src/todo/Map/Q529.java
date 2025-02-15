package todo.Map;

public class Q529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length;
        int n = board[0].length;
        int x = click[0];
        int y = click[1];
        dfs(board, x, y, m, n, true);
        return board;
    }

    void dfs(char[][] board, int x, int y, int m, int n, boolean choose) {
        int[][] step = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        if (choose && board[x][y] == 'M') {
            board[x][y] = 'X';
            return;
        }
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y]!= 'E') {
            return;
        }
        int count = getCount(board, x, y, m, n);
        if (count == 0) {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                dfs(board, x + step[i][0], y + step[i][1], m, n, false);
            }
        } else {
            board[x][y] = (char) (count + '0');
        }
    }

    int getCount(char[][] board, int x, int y, int m, int n) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(m - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(n - 1, y + 1); j++) {
                if ((i == x && j == y)) {
                    continue;
                } else if (board[i][j] == 'M') {
                    count++;
                }
            }
        }
        return count;
    }

}
