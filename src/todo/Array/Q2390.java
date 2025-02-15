package todo.Array;

public class Q2390 {

    public static void main(String[] args) {
        removeStars("erase*****");
    }

    public static String removeStars(String s) {
        char[] chs = s.toCharArray();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chs[i] == '*') {
                if (index > 0 && chs[index - 1] != '*') {
                    index--;
                } else {
                    chs[index++] = '*';
                }
            } else {
                chs[index++] = chs[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(chs[i]);
        }
        return sb.toString();
    }
}
