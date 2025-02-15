package LeetCode.Q200;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 16:59
 */
public class Q106 {
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


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        if (n == 0) {
            return null;
        }
        TreeNode root = build(inorder, 0, n - 1, postorder, 0, n - 1);
        return root;
    }

    public TreeNode build(int[] inorder, int is, int ie, int[] postorder, int ps, int pe) {
        if (is > ie) {
            return null;
        }
        int rootval = postorder[pe];
        int index = -1;
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == rootval) {
                index = i;
                break;
            }
        }
        int size = index - is;
        TreeNode root = new TreeNode(rootval);
        root.left = build(inorder, is, index - 1, postorder, ps, ps + size - 1);
        root.right = build(inorder, index + 1, ie, postorder, ps + size, pe - 1);
        return root;
    }
}
