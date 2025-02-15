package todo.Monotony;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Q496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] < nums2[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && nums2[i] >= nums2[stack.peek()]) {
                    int top = stack.poll();
                    int index = map.getOrDefault(nums2[top],-1);
                    if(index!=-1){
                        result[index] = nums2[i];
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }
}
