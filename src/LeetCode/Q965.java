package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/30 18:42
 */
public class Q965 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }


  public static boolean isUnivalTree(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left != null && root.left.val != root.val) {
      return false;
    }
    if (root.right != null && root.right.val != root.val) {
      return false;
    }
    return isUnivalTree(root.left) && isUnivalTree(root.right);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
