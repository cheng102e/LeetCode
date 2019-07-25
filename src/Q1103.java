public class Q1103 {

  public int[] distributeCandies(int candies, int num_people) {
    int[] number = new int[num_people];
    int num = 1;
    int i = 0;
    while (candies > 0) {

      number[i] += num;
      candies -= num;
      i++;
      if (i == num_people) {
        i = 0;
      }
      if (candies > num + 1) {
        num++;
      } else {
        number[i] += candies;
        break;
      }

    }
    return number;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
