public class Q962 {

  public static int maxWidthRamp(int[] A) {
    int ans = 0;
    int len = A.length;
    for (int i = 0; i < len; i++) {
      for (int j = len - 1; j >= 0 && j > i; j--) {
        if ((j - i) < ans) {
          break;
        }
        if (A[j] >= A[i]) {
          ans = Math.max(ans, (j - i));
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
