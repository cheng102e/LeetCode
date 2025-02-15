package todo.Link;

import Model.ListNode;

public class Q25 {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        reverseKGroup(h1, 3);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy;
        while (cur != null) {
            for (int i = 0; i < k; i++) {
                if (cur.next == null) {
                    return dummy.next;
                }
                cur = cur.next;
            }
            ListNode node = reverse(pre, cur);
            pre = node;
            cur = node;
        }

        return dummy.next;
    }

    public static ListNode reverse(ListNode pre, ListNode tail) {
        ListNode newTail = pre.next;
        ListNode cur = pre.next;
        ListNode last = tail.next;
        while (cur != tail) {
            ListNode tmp = cur.next;
            cur.next = last;
            last = cur;
            cur = tmp;
        }
        cur.next = last;
        pre.next = cur;
        return newTail;
    }
}
