package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2019/12/29 21:02
 */
public class Q66 {

  public static int[] plusOne(int[] digits) {
    if (digits.length == 0) {
      return null;
    }
    int len = digits.length;
    digits[len - 1] += 1;
    for (int i = len - 1; i > 0; i--) {
      if (digits[i] >= 10) {
        digits[i] -= 10;
        digits[i - 1] += 1;
      }

    }
    if (digits[0] == 10) {
      int[] newdigits = new int[len + 1];
      newdigits[0] = 1;
      digits[0] -= 10;
      for (int i = 0; i < len; i++) {
        newdigits[i + 1] = digits[i];
      }
      return newdigits;
    }
    return digits;


  }

  public static void main(String[] args) {

    System.out.println("Hello World!");
  }

}
