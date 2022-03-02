package LeetCode;

import java.util.Arrays;

public class Q899 {

  public static String orderlyQueue(String S, int K) {
    int len = S.length();

    if (K == 1) {
      String word = S;
      S = S + S;
      for (int i = 0; i < len; i++) {
        if (word.compareTo(S.substring(i, i + len)) > 0) {
          word = S.substring(i, i + len);
        }
      }
      return word;
    } else {
      char[] word = S.toCharArray();
      Arrays.sort(word);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < S.length(); i++) {
        sb.append(word[i]);
      }
      return sb.toString();
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
