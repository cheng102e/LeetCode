public class Q709 {

  public static String toLowerCase(String str) {
    char[] c = str.toCharArray();
    String s = "";
    for (int i = 0; i < str.length(); i++) {
      if (c[i] >= 65 && c[i] <= 90) {
        s = s + (char) (c[i] + 32);
      } else {
        s = s + (char) c[i];
      }
    }
    return s;
    //    return str.toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
