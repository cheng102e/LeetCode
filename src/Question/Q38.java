package Question;

public class Q38 {

  public String countAndSay(int n) {
    String str = "1";

    for (int i = 2; i <= n; i++) {
      StringBuilder sb = new StringBuilder();
      char old = str.charAt(0);
      int num = 1;
      for (int j = 1; j < str.length(); j++) {
        char one = str.charAt(j);
        if (one == old) {
          num++;
        } else {
          sb.append(num);
          sb.append(old);
          old = one;
          num = 1;
        }
      }
      sb.append(num);
      sb.append(old);
      str = sb.toString();
    }

    return str;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
