package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-13 15:02
 */
public class Q101 {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean compare(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        if (l.val == r.val) {
            return compare(l.left, r.right) && compare(l.right, r.left);
        } else {
            return false;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return compare(root.left, root.right);
        }
    }
}
