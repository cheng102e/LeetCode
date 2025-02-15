package LeetCode.Q1000;

import java.util.HashSet;

public class Q804 {

  public static int uniqueMorseRepresentations(String[] words) {
    String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."};
    HashSet<String> hashset = new HashSet<String>();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      StringBuilder sc = new StringBuilder("");
      for (int j = 0; j < word.length(); j++) {
        sc.append(codes[word.charAt(j) - 97]);
      }
      hashset.add(sc.toString());
    }
    return hashset.size();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
