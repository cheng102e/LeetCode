package LeetCode.Q400;

public class Q389 {

  public static char findTheDifference(String s, String t) {
    char ch1[] = s.toCharArray();
    char ch2[] = t.toCharArray();
    int sum = 0;
    for (int i = 0; i < ch1.length; i++) {
      sum = sum + (int) ch1[i];
    }
    for (int i = 0; i < ch2.length; i++) {
      sum = sum - (int) ch2[i];
    }
    sum = Math.abs(sum);
    char c = (char) sum;
    return c;

  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
