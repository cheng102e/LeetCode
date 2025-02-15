package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q1161 {
    public List<List<Integer>> result = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        dfs(root, 1);
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            int sum = 0;
            for (int count : result.get(i)) {
                sum += count;
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index+1;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (result.size() < depth) {
            result.add(new ArrayList<>());
        }
        List<Integer> list = result.get(depth - 1);
        list.add(root.val);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
