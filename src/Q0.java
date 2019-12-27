public class Q0 {

  public static void main(String[] args) {
    int max=100,min=1;
    long randomNum = System.currentTimeMillis();
    int ran3 = (int) (randomNum%(max-min)+min);
    System.out.println(ran3);
  }

}
