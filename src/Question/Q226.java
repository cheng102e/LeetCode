package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-13 17:04
 */
public class Q226 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      if (root.left != null) {
        invertTree(root.left);
      }
      if (root.right != null) {
        invertTree(root.right);
      }
    }
    return root;
  }
}
