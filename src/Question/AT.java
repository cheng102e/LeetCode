package Question;

import java.util.Scanner;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */
public class AT {

  public static boolean match(int n) {
    boolean flag = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n == 1) {
    }else {
      for (int i = 2; i <= n; i++) {
        if (match(i)) {
          System.out.print(i);
        }
      }
    }
  }
}
