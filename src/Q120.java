import java.util.List;

public class Q120 {

  public int minimumTotal(List<List<Integer>> triangle) {
    for (int i = triangle.size() - 2; i >= 0; i--) {
      for (int j = 0; j < triangle.get(i).size(); j++) {
        int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
        triangle.get(i).set(j, triangle.get(i).get(j) + min);
      }
    }

    return triangle.get(0).get(0);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
