package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 16:59
 */
public class Q105 {
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


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = preorder.length;
        if (n == 0) {
            return null;
        }
        TreeNode root = build(preorder, 0, n - 1, inorder, 0, n - 1);

        return root;
    }

    public TreeNode build(int[] pre, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe) {
            return null;
        }
        int rootval = pre[ps];
        int index = -1;
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == rootval) {
                index = i;
                break;
            }
        }
        int size = index - is;
        TreeNode root = new TreeNode(rootval);
        root.left = build(pre, ps + 1, ps + size, inorder, is, index - 1);
        root.right = build(pre, ps + size + 1, pe, inorder, index + 1, ie);
        return root;
    }
}
