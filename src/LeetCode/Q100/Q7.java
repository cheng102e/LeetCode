package LeetCode.Q100;

public class Q7 {

  public static int reverse(int x) {
    int ans = 0;
    int num = Math.abs(x);
    int max = Integer.MAX_VALUE / 10;
    while (num > 0) {
      int t = num % 10;
      if (ans > max) {
        return 0;
      }
      ans = ans * 10 + t;

      num = num / 10;
    }
    if (x > 0) {
      return ans;
    } else {
      return -ans;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
