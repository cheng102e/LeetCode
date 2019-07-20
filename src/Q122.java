public class Q122 {

  public static int addDigits(int num) {

    if (num > 9) {
      num = num % 9;
      if (num == 0) {
        return 9;
      }
    }
    return num;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
