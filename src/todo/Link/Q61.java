package todo.Link;

import Model.ListNode;

public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        int len = 0;
        ListNode dummy = new ListNode(0, head);
        ListNode tail = dummy;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            tail = tail.next;
            len++;
        }
        if (len == 0) {
            return head;
        }
        tail.next = head;
        k = k % len;
        int count = len - k;
        ListNode pre = dummy;
        while (count-- > 0) {
            pre = pre.next;
            head = head.next;
        }
        pre.next = null;
        dummy.next = head;
        return dummy.next;
    }

}
