package todo.Link;

import Model.ListNode;

import java.util.Arrays;
import java.util.LinkedList;

public class Q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        LinkedList<ListNode> result = new LinkedList<>(Arrays.asList(lists));
        while (result.size() > 1) {
            ListNode l1 = result.pollFirst();
            ListNode l2 = result.pollFirst();
            ListNode newHead = mergeTwoLists(l1, l2);
            result.add(newHead);
        }
        return result.get(0);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if (list1 != null) {
            head.next = list1;
        } else {
            head.next = list2;
        }
        return dummy.next;
    }
}
