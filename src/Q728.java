import java.util.ArrayList;
import java.util.List;

public class Q728 {

  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = left; i <= right; i++) {
      if (isSelf(i)) {
        result.add(i);
      }
    }
    return result;
  }

  public static boolean isSelf(int number) {
    int num = number;
    while (num != 0) {
      int n = num % 10;
      num = num / 10;
      if (n == 0 || number % n != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
