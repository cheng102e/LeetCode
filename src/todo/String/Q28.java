package todo.String;

public class Q28 {
    public int strStr(String haystack, String needle) {
        char[] use = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for (int i = 0; i <= use.length - need.length; i++) {
            for (int j = 0; j < need.length; j++) {
                if (use[i + j] != need[j]) {
                    break;
                }
                if (j == need.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
