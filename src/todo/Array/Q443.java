package todo.Array;

public class Q443 {
    public static void main(String[] args) {
        compress(new char[]{'a'});
//        compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});
    }

    public static int compress(char[] chars) {
        char pre = chars[0];
        int save = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == pre) {
                count++;
            } else  {
                save = save(chars, pre, count, save);
                pre = chars[i];
                count = 1;
            }
        }
        save = save(chars, pre, count, save);
        return save;
    }

    public static int save(char[] chars, char pre, int count, int save) {
        chars[save++] = pre;
        if (count == 1) {
            return save;
        }
        String s = String.valueOf(count);
        for (int i = 0; i < s.length(); i++) {
            chars[save++] = s.charAt(i);
        }
        return save;
    }
}
