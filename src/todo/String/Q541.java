package todo.String;

public class Q541 {
    private static void swap(int left, int right, char[] ch) {
        while (left < right) {
            char tmp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = tmp;
        }
    }

    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i = i + 2 * k) {
            swap(i, Math.min(i + k - 1, length - 1), chars);
        }
        return new String(chars);
    }
}
