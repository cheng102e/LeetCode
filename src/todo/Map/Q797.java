package todo.Map;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q797 {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    Deque<Integer> stack = new ArrayDeque<Integer>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return ans;
    }

    void dfs(int[][] graph, int start, int end) {
        if (start == end) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int city : graph[start]) {
            stack.offerLast(city);
            dfs(graph, city, end);
            stack.pollLast();
        }
    }
}
