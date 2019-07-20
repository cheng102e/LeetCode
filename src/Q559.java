import java.util.List;

public class Q559 {

  class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }



  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }
    int max = 0;
    for (Node n : root.children) {
      max = Math.max(max, maxDepth(n));
    }
    return max + 1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
