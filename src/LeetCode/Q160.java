package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-17 13:39
 */
public class Q160 {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null || headB == null) {
      return null;
    }
    ListNode pA = headA, pB = headB;
    while (pA != pB) {
      if (pA == null) {
        pA = headB;
      } else {
        pA = pA.next;
      }
      if (pB == null) {
        pB = headA;
      } else {
        pB = pB.next;
      }

    }
    return pA;
  }
}
