package LeetCode.Q100;

import java.util.PriorityQueue;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/24 11:42
 */
public class Q23 {
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


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode pre = new ListNode();
        ListNode cur = pre;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b) -> (a.val - b.val));
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            cur = cur.next;
        }
        return pre.next;
    }
}
