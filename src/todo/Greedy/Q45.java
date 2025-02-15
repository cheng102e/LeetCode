package todo.Greedy;

public class Q45 {
    public int jump(int[] nums) {
        int curLength = 0;
        int result = 0;
        int nextLength = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextLength = Math.max(nextLength, i + nums[i]);
            if (i >= curLength) {
                curLength = nextLength;
                result++;
            }
        }

        return result;

    }
}
