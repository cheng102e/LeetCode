package todo.Back;

public class Q79 {
    public static void main(String[] args) {
        exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}},"ABCESEEEFS");
    }
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == words[0]) {
                    boolean result = check(board, i, j, m, n, words, 0, new boolean[m][n]);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean check(char[][] board, int i, int j, int m, int n, char[] words, int index, boolean[][] visited) {
        if (index == words.length) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != words[index] || visited[i][j]) {
            // 非法位置或不等于或已使用
            return false;
        }
        visited[i][j] = true;
        boolean result = check(board, i + 1, j, m, n, words, index + 1, visited)
                || check(board, i - 1, j, m, n, words, index + 1, visited)
                || check(board, i, j + 1, m, n, words, index + 1, visited)
                || check(board, i, j - 1, m, n, words, index + 1, visited);
        if(result){
            return true;
        }else {
            visited[i][j] = false;
            return false;
        }
    }
}
