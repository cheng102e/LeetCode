package todo.Back;

public class Q37 {
    public void solveSudoku(char[][] board) {
        back(board);
    }

    public boolean back(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    continue;
                }
                for (char k = '1'; k <= '9'; k++) {
                    if (isValid(i, j, k, board)) {
                        board[i][j] = k;
                        if (back(board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                // 代表该解法有问题
                return false;
            }
        }
        return true;
    }

    public boolean isValid(int i, int j, char k, char[][] board) {
        for (int x = 0; x < 9; x++) {
            if (board[x][j] == k) {
                return false;
            }
        }
        for (int y = 0; y < 9; y++) {
            if (board[i][y] == k) {
                return false;
            }
        }
        // 若为 2，8点，则转为七宫，0-2，6-8
        int startRow = i / 3 * 3;
        int startCol = j / 3 * 3;
        for (int x = startRow; x < startRow + 3; x++) {
            for (int y = startCol; y < startCol + 3; y++) {
                if (board[x][y] == k) {
                    return false;
                }
            }
        }
        return true;
    }
}
