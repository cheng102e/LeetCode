package LeetCode.Q200;

public class Q125 {


  public boolean isPalindrome(String s) {
    if (s == null) {
      return true;
    }
    s = s.toLowerCase();
    char[] word = s.toCharArray();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < word.length; i++) {
      if ((word[i] >= '0' && word[i] <= '9') || (word[i] >= 'a' && word[i] <= 'z')) {
        str.append(word[i]);
      }
    }
    return str.toString().equals(str.reverse().toString());
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
