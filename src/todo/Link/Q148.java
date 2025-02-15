package todo.Link;

import Model.ListNode;

public class Q148 {
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        // 0个点
        if (head == null) {
            return head;
        }
        // 1个点
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        // 快慢指针找中点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != tail) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next != tail) {
                fast = fast.next;
            }
        }
        // 左闭右开
        ListNode left = sortList(head, slow);
        ListNode right = sortList(slow, tail);
        return merge(left, right);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if(l1 == null){
            l1 = l2;
        }
        cur.next= l1;
        return dummy.next;
    }
}
