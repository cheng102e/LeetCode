package todo.Back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q40 {
    static List<List<Integer>> result = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        back(candidates, used, 0, target);
        return result;
    }

    public static void back(int[] candidates, boolean[] used, int index, int targetSum) {
        if (targetSum < 0) {
            return;
        }
        if (targetSum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            path.add(candidates[i]);
            back(candidates, used, i + 1, targetSum - candidates[i]);
            used[i] = false;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        combinationSum2(new int[]{2,5,2,1,2}, 5);
    }
}
