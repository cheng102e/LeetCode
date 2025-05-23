package LeetCode.Q100;

public class Q9 {

  public static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    int num = 0;
    while (x > num) {
      num = num * 10 + x % 10;
      x = x / 10;
    }

    return x == num || x == num / 10;

  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
