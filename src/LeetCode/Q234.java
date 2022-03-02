package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-18 13:24
 */
public class Q234 {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<Integer>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    int len = list.size();
    Integer[] num = list.toArray(new Integer[len]);
    for (int i = 0; i <= len / 2; i++) {
      if (!num[i].equals(num[len - 1 - i])) {
        return false;
      }
    }
    return true;
  }
}
