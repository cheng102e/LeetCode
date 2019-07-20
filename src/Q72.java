public class Q72 {

  public static int minDistance(String word1, String word2) {
    int len1 = word1.length();
    int len2 = word2.length();

    int[][] step = new int[len1 + 1][len2 + 1];

    for (int i = 0; i <= len1; i++) {
      step[i][0] = i;
    }
    for (int j = 0; j <= len2; j++) {
      step[0][j] = j;
    }

    for (int i = 1; i <= len1; i++) {
      char letter1 = word1.charAt(i - 1);
      for (int j = 1; j <= len2; j++) {
        char letter2 = word2.charAt(j - 1);

        if (letter1 == letter2) {   //若字母相同，即直接添加，不增加步数
          step[i][j] = step[i - 1][j - 1];
        } else {
          int ReNum = step[i - 1][j - 1] + 1;
          //修改
          int InNum = step[i - 1][j] + 1;
          //插入
          int DeNum = step[i][j - 1] + 1;
          //删除
          int min = Math.min(ReNum, Math.min(InNum, DeNum));
          step[i][j] = min;
        }
      }
    }
    return step[len1][len2];
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
