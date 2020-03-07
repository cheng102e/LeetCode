package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/16 13:05
 */
public class Q344 {

  public void reverseString(char[] s) {
    int left = 0, right = s.length - 1;
    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
