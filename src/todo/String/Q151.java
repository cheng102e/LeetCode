package todo.String;

public class Q151 {
    private static void swap(int left, int right, char[] ch) {
        while (left < right) {
            char tmp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = tmp;
        }
    }

    private static char[] getArray(String s) {
        String newString = s.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newString.length(); i++) {
            if (i > 0 && newString.charAt(i) == ' ' && newString.charAt(i - 1) == ' ') {
                continue;
            }
            sb.append(newString.charAt(i));
        }
        return sb.toString().toCharArray();
    }

    public static String reverseWords(String s) {
        char[] chars = getArray(s);
        int length = chars.length;
        swap(0, length - 1, chars);
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                swap(index, i - 1, chars);
                index = i + 1;
            } else if (i == length - 1) {
                swap(index, i, chars);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        reverseWords("the sky  is blue");
    }
}
