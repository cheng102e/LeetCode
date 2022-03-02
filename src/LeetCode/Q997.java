package LeetCode;

public class Q997 {

  public int findJudge(int N, int[][] trust) {
    int[][] people = new int[N][2];
    for (int i = 0; i < trust.length; i++) {
      int out = trust[i][0];
      int in = trust[i][1];
      people[out - 1][0]++;
      people[in - 1][1]++;
    }
    for (int i = 0; i < N; i++) {
      if (people[i][0] == 0 && people[i][1] == N - 1) {
        return i + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
