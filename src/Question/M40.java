package Question;

import java.util.PriorityQueue;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-20 17:52
 */
public class M40 {

  public int[] getLeastNumbers(int[] arr, int k) {
    PriorityQueue<Integer> heap =
        new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
    for (int n : arr) {
      heap.add(n);
    }
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = heap.poll();
    }
    return ans;
  }
}
