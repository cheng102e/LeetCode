package todo.Greedy;

import Model.TreeNode;

public class Q968 {
    int result;

    public int minCameraCover(TreeNode root) {
        result = 0;

        if (traversal(root) == 0) {
            result++;
        }
        return result;
    }

    public int traversal(TreeNode root) {
        // 0 无覆盖 1 有摄像 2 被覆盖
        if (root == null) {
            return 2;
        }
        int left = traversal(root.left);
        int right = traversal(root.right);
        if (left == 2 && right == 2) {
            return 0;
        } else if (left == 0 || right == 0) {
            result++;
            return 1;
        } else {
            return 2;
        }
    }
}
