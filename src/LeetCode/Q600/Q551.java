package LeetCode.Q600;

public class Q551 {

  public static boolean checkRecord(String s) {
    int num = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        num++;
      }
      if (num >= 2) {
        return false;
      }
    }
    if (s.contains("LLL")) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
