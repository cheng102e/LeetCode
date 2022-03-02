package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-19 9:25
 */
public class Q409 {

  public int longestPalindrome(String s) {
    StringBuffer str = new StringBuffer(s);
    int[] num = new int[52];
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= 'a' && c <= 'z') {
        num[c - 'a']++;
      } else {
        num[c - 'A' + 26]++;
      }
    }
    int length = 0;
    for (int i = 0; i < 52; i++) {
      length += num[i] / 2;
    }
    length *= 2;
    if (str.length() > length) {
      length++;
    }
    return length;
  }
}
