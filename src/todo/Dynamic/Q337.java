package todo.Dynamic;

import Model.TreeNode;

public class Q337 {
    public int rob(TreeNode root) {
        int[] result = action(root);
        // 0 偷该点
        // 1 不偷该点
        return Math.max(result[0], result[1]);
    }

    int[] action(TreeNode root) {
        int[] result = new int[2];
        if (root == null) {
            return result;
        }
        int[] left = action(root.left);
        int[] right = action(root.right);
        result[0] = left[1] + root.val + right[1];
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return result;
    }

}
