package LeetCode.Q600;

public class Q504 {

  public static String convertToBase7(int num) {
    String res = "";
    int flag = 0;
    if (num == 0) {
      return "0";
    }
    if (num < 0) {
      flag = 1;
      num = -num;
    }
    while (num > 0) {
      res = String.valueOf(num % 7) + res;
      num = num / 7;
    }
    if (flag == 1) {
      res = "-" + res;
    }
    return res;

  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
