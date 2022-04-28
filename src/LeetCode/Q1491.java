package LeetCode;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/24 18:19
 */
public class Q1491 {
    public double average(int[] salary) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }

        return (double) (sum - max - min) / (salary.length - 2);
    }
}
