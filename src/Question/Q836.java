package Question;

public class Q836 {

  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    if (rec2[0] >= rec1[2] || rec1[0] >= rec2[2] ||
        rec2[1] >= rec1[3] || rec1[1] >= rec2[3]) {
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
