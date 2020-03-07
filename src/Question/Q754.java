package Question;

public class Q754 {

  public static int reachNumber(int target) {
    target = Math.abs(target); //处理负值的情况
    int count = 0;
    int sum = 0;
    while (sum < target) {
      count++;
      sum = sum + count;
    }
    if ((sum - target) % 2 != 0) {
      if (count % 2 == 0) {
        count = count + 1;
      } else {
        count = count + 2;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
