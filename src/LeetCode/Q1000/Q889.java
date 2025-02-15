package LeetCode.Q1000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 21:59
 */
public class Q889 {
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

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = postorder.length;
        if (n == 0) {
            return null;
        }
        TreeNode root = build(preorder, 0, n - 1, postorder, 0, n - 1);
        return root;
    }

    public TreeNode build(int[] preorder, int pres, int pree, int[] postorder, int posts, int poste) {
        if (pres > pree) {
            return null;
        }
        if (pres == pree) {
            return new TreeNode(preorder[pres]);
        }
        int rootval = preorder[pres];
        int leftval = preorder[pres + 1];
        int index = -1;
        for (int i = posts; i <= poste; i++) {
            if (postorder[i] == leftval) {
                index = i;
                break;
            }
        }
        int size = index - posts + 1;

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootval);
        // 递归构造左右⼦树
        // 根据左⼦树的根节点索引和元素个数推导左右⼦树的索引边界
        root.left = build(preorder, pres + 1, pres + size,
                postorder, posts, index);
        root.right = build(preorder, pres + size + 1, pree,
                postorder, index + 1, poste - 1);

        return root;
    }
}
