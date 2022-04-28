package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/10 10:17
 */
public class Q797 {

    List<List<Integer>> res = new LinkedList<>();


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }

    void traverse(int[][] graph, int s, LinkedList<Integer> path) {
        path.add(s);
        int n = graph.length;
        if (n - 1 == s) {
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }
        for (int v : graph[s]) {
            traverse(graph, v, path);
        }
        path.removeLast();
    }
}
