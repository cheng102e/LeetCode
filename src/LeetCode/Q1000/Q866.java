package LeetCode.Q1000;

public class Q866 {

  public static int primePalindrome(int N) {
    if (N <= 2) {
      return 2;
    } else if (N <= 3) {
      return 3;
    } else if (N <= 5) {
      return 5;
    } else if (N <= 7) {
      return 7;
    } else if (N <= 11) {
      return 11;
    }

    for (int i = N; ; ) {
      if (isHui(i) && isPrime(i)) {
        return i;
      }

      if ((i + "").length() % 2 == 0) {
        i = (int) (Math.pow(10, (i + "").length()) + 1);
      } else {
        i++;
      }

    }
  }

  public static boolean isPrime(int i) {
    for (int j = 2; j <= Math.sqrt(i); j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isHui(int s) {
    String str = s + "";
    int len = str.length();
    for (int j = 0; j < len / 2; j++) {
      if (str.charAt(j) != str.charAt(len - j - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
