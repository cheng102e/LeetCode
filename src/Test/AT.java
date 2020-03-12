package Test;

import java.util.Scanner;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */
public class AT {

  public boolean canThreePartsEqualSum(int[] A) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
    }
    if (sum % 3 != 0) {
      return false;
    }
    sum = sum / 3;
    int suma = 0, sumc = 0;
    int i = 0, j = A.length - 1;
    while (i < j) {
      if (suma != sum) {
        suma += A[i++];
      }
      if (sumc != sum) {
        sumc += A[j--];
      }
      if (suma == sum && sumc == sum && i < j) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println(a + b);
    }
  }
}
