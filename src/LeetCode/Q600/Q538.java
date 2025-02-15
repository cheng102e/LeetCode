package LeetCode.Q600;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-14 17:11
 */
public class Q538 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  int sum = 0;

  public TreeNode convertBST(TreeNode root) {
    if (root != null) {

      convertBST(root.right);
      sum += root.val;
      root.val = sum;
      convertBST(root.left);
    }
    return root;
  }
}
