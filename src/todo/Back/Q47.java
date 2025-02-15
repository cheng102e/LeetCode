package todo.Back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q47 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        Arrays.fill(used, false);
        back(nums, used);
        return result;
    }

    public void back(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            // 和前一个相同，并且前一个在该层未使用
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            back(nums, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
