package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-14 17:11
 */
public class Q1038 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  int sum = 0;

  public TreeNode bstToGst(TreeNode root) {
    if (root != null) {

      bstToGst(root.right);
      sum += root.val;
      root.val = sum;
      bstToGst(root.left);
    }
    return root;
  }
}
