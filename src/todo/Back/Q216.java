package todo.Back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q216 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrace(k, 1, n);
        return result;
    }

    public void backTrace(int k, int index, int targetSum) {
        if (targetSum < 0) {
            return;
        }
        if (path.size() == k) {
            if (targetSum == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = index; i <= 9; i++) {
            path.add(i);
            backTrace(k, i + 1, targetSum - i);
            path.removeLast();
        }
    }

}
