package todo.Tree;

import Model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q437 {
    int result = 0;

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        dfs(root, 0, targetSum, map);
        return result;
    }

    public void dfs(TreeNode root, long sum, int targetSum, Map<Long, Integer> map) {
        if (root == null) {
            return;
        }
        sum += root.val;
        result += map.getOrDefault(sum - targetSum, 0);
        int count = (map.getOrDefault(sum, 0) + 1);
        map.put((long) sum, count);
        dfs(root.left, sum, targetSum, map);
        dfs(root.right, sum, targetSum, map);
        map.put((long) sum, count - 1);
    }
}
