package LeetCode.Q200;

import Model.TreeNode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-13 15:02
 */
public class Q101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            // 两节点为空
            return true;
        } else if (left == null || right == null) {
            // 两节点仅一个为空
            return false;
        } else if (left.val == right.val) {
            // 交叉比较
            return compare(left.left, right.right) && compare(left.right, right.left);
        } else {
            // 两节点不等
            return false;
        }
    }
}
