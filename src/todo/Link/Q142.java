package todo.Link;

import Model.ListNode;

public class Q142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode run = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            if (fast == slow) {
                while (run != slow) {
                    run = run.next;
                    slow = slow.next;
                }
                return run;
            }
        }
        return null;

    }
}
