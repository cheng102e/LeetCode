package todo.Link;

import Model.ListNode;

public class Q92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        for (int i = 0; i < left - 1; i++) {
            cur = cur.next;
        }
        // cur 为left节点的前一个
        reverse(cur, right - left + 1);
        return dummy.next;
    }

    // 可复用，需要记忆
    static void reverse(ListNode head, int length) {
        ListNode pre = null;
        ListNode cur = head.next;
        for (int i = 0; i < length; i++) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        head.next.next = cur;
        head.next = pre;
    }

    public static void main(String[] args) {
        // 构建链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode reversed = reverseBetween(node1, 2, 4);
        // 输出反转后的链表
        ListNode temp = reversed;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
