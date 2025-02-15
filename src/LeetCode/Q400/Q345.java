package LeetCode.Q400;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/16 13:05
 */
public class Q345 {

  public static boolean find(char c) {
    return !(c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u' || c == 'A' || c == 'O'
        || c == 'E' || c == 'I' || c == 'U');
  }

  public static String reverseVowels(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    while (left < right) {
      while (left < arr.length && find(arr[left])) {
        left++;
      }
      while (right >= 0 && find(arr[right])) {
        right--;
      }
      if (left >= right) {
        break;
      }
      char temp = arr[right];
      arr[right--] = arr[left];
      arr[left++] = temp;
    }
    String result = new String(arr);
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
