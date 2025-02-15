package todo.Link;

import Model.ListNode;

public class Q328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode oddCur = odd;
        ListNode dummy = new ListNode(0, head);
        ListNode cur = head;
        ListNode pre = dummy;
        int count = 1;
        while (cur != null) {
            if (count % 2 == 1) {
                pre.next = cur;
                pre = pre.next;
                cur = cur.next;
            } else {
                oddCur.next = cur;
                oddCur = oddCur.next;
                cur = cur.next;
            }
            count++;
        }
        oddCur.next = null;
        pre.next = odd.next;
        return dummy.next;
    }
}
