package todo.Back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q39 {
    static List<List<Integer>> result = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates, 0, target);
        return result;
    }

    public static void back(int[] candidates, int index, int targetSum) {
        if (targetSum < 0) {
            return;
        }
        if (targetSum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            back(candidates, i, targetSum - candidates[i]);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
