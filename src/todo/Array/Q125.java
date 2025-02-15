package todo.Array;

public class Q125 {
    public static void main(String[] args) {
        String str = ".,";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < s.length() && !isUseful(chs[left])) {
                left++;
            }
            while (right >= 0 && !isUseful(chs[right])) {
                right--;
            }
            if (left >= right) {
                return true;
            }
            if (isSame(chs[left], chs[right])) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    static boolean isUseful(char ch) {
        return ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }

    static boolean isSame(char a, char b) {
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
