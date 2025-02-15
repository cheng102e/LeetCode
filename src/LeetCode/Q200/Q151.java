package LeetCode.Q200;

public class Q151 {

  public static String reverseWords(String s) {
    String[] splitStr = s.split(" ");
    StringBuffer result = new StringBuffer("");
    for (int i = (splitStr.length - 1); i >= 0; i--) {
      if (!splitStr[i].equals("")) {
        result.append(splitStr[i]);
        result.append(" ");
      }
    }
    return result.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
