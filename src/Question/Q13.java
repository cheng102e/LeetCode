package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2019/12/27 17:39
 */
public class Q13 {

  public static int romanToInt(String s) {
    int len = s.length();
    int num = 0;
    for (int i = 0; i < len; i++) {
      switch (s.charAt(i)) {
        case 'I':
          num += 1;
          break;
        case 'V':
          num += 5;
          break;
        case 'X':
          num += 10;
          break;
        case 'L':
          num += 50;
          break;
        case 'C':
          num += 100;
          break;
        case 'D':
          num += 500;
          break;
        case 'M':
          num += 1000;
          break;
        default:
          System.out.println("default");
          break;
      }
      if (i != 0) {
        if (s.charAt(i - 1) == 'I') {
          if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
            num -= 2;
          }
        }
        if (s.charAt(i - 1) == 'X') {
          if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
            num -= 20;
          }
        }
        if (s.charAt(i - 1) == 'C') {
          if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
            num -= 200;
          }
        }
      }
    }

    return num;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
