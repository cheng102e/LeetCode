package LeetCode.Q100;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/24 17:07
 */
public class Q92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newhead = new ListNode(0, head);
        ListNode l = newhead;
        for (int i = 0; i < left - 1; i++) {
            l = l.next;
        }
        ListNode pre = null;
        ListNode cur = l.next;
        int len = right - left + 1;
        ListNode r = cur;
        while (len > 0) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            len--;
        }
        l.next = pre;
        r.next = cur;
        return newhead.next;
    }
}
