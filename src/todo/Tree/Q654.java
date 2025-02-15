package todo.Tree;

import Model.TreeNode;

public class Q654 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree1(nums, 0, nums.length);
    }

    public static TreeNode constructMaximumBinaryTree1(int[] nums, int left, int right) {
        if (right - left < 1) {
            return null;
        }
        if (right - left == 1) {
            return new TreeNode(nums[left]);
        }
        int maxValue = -1;
        int maxIndex = 0;
        for (int i = left; i < right; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = constructMaximumBinaryTree1(nums, left, maxIndex);
        root.right = constructMaximumBinaryTree1(nums, maxIndex + 1, right);
        return root;
    }

    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
    }
}
