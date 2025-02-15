package LeetCode.Q300;

import java.util.PriorityQueue;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/16 12:12
 */
public class Q215 {

  public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap =
        new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
    for (int n : nums) {
      heap.add(n);
      if (heap.size() > k) {
        heap.poll();
      }
    }
    return heap.poll();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
