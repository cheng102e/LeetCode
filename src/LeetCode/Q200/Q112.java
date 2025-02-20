package LeetCode.Q200;

public class Q112 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left == null && root.right == null) {
      return sum == root.val;
    }

    return hasPathSum(root.left, sum - root.val)
        || hasPathSum(root.right, sum - root.val);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
