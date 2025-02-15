package LeetCode.Q600;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-18 14:02
 */
public class Q543 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  int max = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    if (root != null) {
      findDepth(root);
      return max;
    }
    return 0;
  }

  public int findDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int left = findDepth(root.left);
      int right = findDepth(root.right);
      max = Math.max(left + right, max);
      return Math.max(left, right) + 1;
    }
  }
}
