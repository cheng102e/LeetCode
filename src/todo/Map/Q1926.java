package todo.Map;

import java.util.LinkedList;
import java.util.Queue;

public class Q1926 {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        int startX = entrance[0];
        int startY = entrance[1];
        boolean[][] visited = new boolean[m][n];  // 用于标记已访问节点
        visited[startX][startY] = true;  // 标记入口已访问
        int dis = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {  // 处理当前层的节点
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                // 检查是否为出口，如果是且不是入口则返回距离
                if ((x == 0 || x == m - 1 || y == 0 || y == n - 1) && (x != startX || y != startY)) {
                    return dis;
                }
                for (int[] dir : dirs) {  // 探索四个方向
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY] && maze[newX][newY] == '.') {
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
            dis++;  // 处理完一层节点，距离加 1
        }
        return -1;
    }
}
