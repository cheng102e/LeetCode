package LeetCode.Q100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/10 15:42
 */
public class Q46 {
    // 答案和路径
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        Arrays.fill(used, false);
        // 初始时每个数都没用过
        backTrace(nums, used);
        return res;
    }

    void backTrace(int[] nums, boolean[] used) {
        // 长度达标输出
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            // 没用过的进行回溯
            path.add(nums[i]);
            used[i] = true;
            backTrace(nums, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
