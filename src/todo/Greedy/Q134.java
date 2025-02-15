package todo.Greedy;

public class Q134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int n = cost.length;
        while (start < n) {
            int cur = start;
            int sum = 0;
            while (cur < 2 * n) {
                sum = sum + gas[cur % n] - cost[cur % n];
                if (sum < 0) {
                    start = cur + 1;
                    cur++;
                    sum = 0;
                } else {
                    cur++;
                    if (cur - start == n) {
                        return start % n;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3});
    }
}
