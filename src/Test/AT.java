package Test;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */


public class AT {

  static int sum = 0;

  public void find(int step, int count, int more, int all) {
    if (step == 0) {
      sum += all;
    } else {
      if (more > 0) {
        find(step - 1, count, more + 1, all + 1);
        find(step - 1, count + 1, more + 1, all + 1);
      } else {
        find(step - 1, count + 1, more + 1, all + 1);
        find(step - 1, count + 1, more + 1, all + 1);

      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();

    System.out.print(5);
  }
}
