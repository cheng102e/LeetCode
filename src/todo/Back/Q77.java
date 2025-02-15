package todo.Back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q77 {
    List<List<Integer>> result;
    LinkedList<Integer> path;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        path = new LinkedList<>();
        backTrace(n, k, 1);
        return result;
    }

    public void backTrace(int n, int k, int index) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index;i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backTrace(n, k, i + 1);
            path.removeLast();
        }
    }
}
