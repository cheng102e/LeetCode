package LeetCode.Q200;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/9 9:19
 */
public class Q116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectNode(root.left,root.right);
        return root;
    }

    public void connectNode(Node n1, Node n2) {
        if (n1 == null || n2 == null) {
            return;
        }
        n1.next = n2;
        connectNode(n1.left, n1.right);
        connectNode(n1.right, n2.left);
        connectNode(n2.left, n2.right);
    }
}
