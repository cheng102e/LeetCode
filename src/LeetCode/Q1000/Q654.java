package LeetCode.Q1000;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 10:51
 */
public class Q654 {

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


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int l, int r) {
        if (l > r) {

            return null;
        }
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = build(nums, l, index - 1);
        root.right = build(nums, index + 1, r);
        return root;
    }

}
