package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Q217 {

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> ans = new HashSet<Integer>();
    for (int i : nums) {
      ans.add(i);
    }
    if (ans.size() == nums.length) {
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
