package LeetCode;

public class Q717 {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for (int i = 0; i < n; i++) {
            if (bits[i] == 1) {
                i++;
            } else if (bits[i] == 0) {
                if (i == n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
