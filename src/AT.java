import java.util.Arrays;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/5 10:47
 */
public class AT {

  public static int findRadius(int[] houses, int[] heaters) {
    Arrays.sort(houses);
    Arrays.sort(heaters);
    int radius = 0;
    int count = 0;
    for (int i = 0; i < houses.length; i++) {
      while (count < heaters.length && houses[i] < heaters[count]) {
        count++;
      }
      if (count == 0) {
        radius = Math.max(radius, heaters[count] - houses[i]);
      } else if (count >= heaters.length) {
        radius = Math.max(radius, houses[houses.length - 1] - heaters[heaters.length - 1]);
      } else {
        radius = Math
            .max(radius, Math.max(heaters[count + 1] - houses[i], houses[i] - heaters[count]));
      }
    }
    return radius;
  }

  public static void main(String[] args) {
    int[] houses = new int[]{1, 2, 3, 4};
    int[] heaters = new int[]{1, 4};

    System.out.println(findRadius(houses, heaters));

  }
}
