package LeetCode.Q300;

import Model.ListNode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-18 11:06
 */
public class Q206 {


    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = pre;
            pre = tmp;
        }
        return pre;
    }


}
