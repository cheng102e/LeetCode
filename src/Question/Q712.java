package Question;

public class Q712 {

  public static int minimumDeleteSum(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    char[] sc1 = s1.toCharArray();
    char[] sc2 = s2.toCharArray();
    int[][] step = new int[len1 + 1][len2 + 1];

    step[0][0] = 0;

    for (int i = 1; i <= len1; i++) {
      step[i][0] = step[i - 1][0] + sc1[i - 1];
    }

    for (int j = 1; j <= len2; j++) {
      step[0][j] = step[0][j - 1] + sc2[j - 1];
    }

    for (int i = 1; i <= len1; i++) {
      for (int j = 1; j <= len2; j++) {
        if (sc1[i - 1] == sc2[j - 1]) {
          step[i][j] = step[i - 1][j - 1];
        } else {
          step[i][j] = Math.min(Math.min(step[i - 1][j] + sc1[i - 1], step[i][j - 1] + sc2[j - 1]),
              step[i - 1][j - 1] + sc1[i - 1] + sc2[j - 1]);

        }
      }
    }

    return step[len1][len2];
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
