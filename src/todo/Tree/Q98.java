package todo.Tree;

import Model.TreeNode;

public class Q98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, Long minValue, Long maxValue) {
        if (root == null) {
            return true;
        }
        long value = root.val;
        if (value <= minValue || value >= maxValue) {
            return false;
        } else {
            return isValidBST(root.left, minValue, value)
                    && isValidBST(root.right, value, maxValue);
        }
    }
}
