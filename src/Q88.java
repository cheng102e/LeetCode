/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/14 21:29
 */
public class Q88 {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    int m1 = m - 1;
    int n1 = n - 1;
    while (m1 >= 0 && n1 >= 0) {
      if (nums1[m1] < nums2[n1]) {
        nums1[index] = nums2[n1];
        n1--;
      } else {
        nums1[index] = nums1[m1];
        m1--;
      }
      index--;
    }
    while (n1 >= 0) {
      nums1[index] = nums2[n1];
      n1--;
      index--;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
