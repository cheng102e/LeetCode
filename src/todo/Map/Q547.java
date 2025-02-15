package todo.Map;

public class Q547 {
    public int findCircleNum(int[][] isConnected) {
        int length = isConnected.length;
        boolean[] visited = new boolean[length];
        int provinces = 0;
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, length, i);
                provinces++;
            }
        }
        return provinces;

    }

    public void dfs(int[][] isConnected, boolean[] visited, int cities, int i) {
        for (int j = 0; j < cities; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, cities, j);
            }
        }
    }

}
