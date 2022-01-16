package Question;

public class Q334 {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > second) {
                return true;
            }
            if (nums[i] < first) {
                first = nums[i];
            }
            if (nums[i] > first && nums[i] < second) {
                second = nums[i];
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
