package todo.Hash;

import java.util.HashMap;

public class Q2352 {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                sb.append(grid[i][j]).append('-');
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < grid[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]).append('-');
            }
            sum += map.getOrDefault(sb.toString(), 0);            ;
        }
        return sum;
    }
}
