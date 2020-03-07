package Question;

public class Q977 {

  public int[] sortedSquares(int[] A) {
    int len = A.length;
    int head = 0;
    int tail = len - 1;
    int[] B = new int[len];
    while (head <= tail) {
      len--;
      int i = A[head] * A[head];
      int j = A[tail] * A[tail];
      if (i > j) {
        B[len] = i;
        head++;
      } else {
        B[len] = j;
        tail--;
      }
    }
    //     B = B.reverse
    return B;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
