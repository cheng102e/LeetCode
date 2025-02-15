package todo.Link;

import Model.ListNode;

public class Q24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            node1.next = node2.next;
            cur.next = node2;
            node2.next = node1;
            cur = node1;
        }
        return dummy.next;
    }
}
