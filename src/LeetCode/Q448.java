package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 18:48
 */
public class Q448 {

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int temp = Math.abs(nums[i]);
      nums[temp - 1] = -Math.abs(nums[temp - 1]);
    }
    List<Integer> ans = new ArrayList(nums.length);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        ans.add(i + 1);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

