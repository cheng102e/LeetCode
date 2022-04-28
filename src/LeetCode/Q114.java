package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 9:33
 */
public class Q114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;

        TreeNode o = root;
        while (o.right != null) {
            o = o.right;
        }
        o.right = right;
    }
}
