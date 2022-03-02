package LeetCode;

import java.util.HashMap;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/17 19:31
 */
public class Q3 {

  public static int lengthOfLongestSubstring(String s) {
    int len = s.length();
    if (len == 0) {
      return 0;
    }
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int max = 0;
    int left = 0;
    for (int right = 0; right < len; right++) {
      if (map.containsKey(s.charAt(right))) {
        left = Math.max(left, map.get(s.charAt(right)) + 1);
      }
      map.put(s.charAt(right), right);
      max = Math.max(max, right - left + 1);
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
