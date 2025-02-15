package todo.Link;

import Model.ListNode;

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int value = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + value;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            value = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        // 获取不为null的那串
        if (l2 != null) {
            l1 = l2;
        }
        while (l1 != null) {
            int sum = l1.val + value;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            value = sum / 10;
            l1 = l1.next;
        }
        if (value != 0) {
            cur.next = new ListNode(value);
        }
        return dummy.next;
    }
}
