public class Q1021 {

  public static String removeOuterParentheses(String S) {
    StringBuilder password = new StringBuilder();
    char[] word = S.toCharArray();
    int val = 0;

    for (int i = 0; i < word.length; i++) {
      if (word[i] == '(') {
        val++;
        if (val != 1) {
          password.append(word[i]);
        }
      } else {
        val--;
        if (val != 0) {
          password.append(word[i]);
        }
      }
    }
    return password.toString();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
