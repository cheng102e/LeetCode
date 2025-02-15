package todo.Array;

import java.util.HashSet;

public class Q345 {
    public static void main(String[] args) {
        reverseVowels("IceCreAm");
    }

    public static String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('E');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < chars.length && !set.contains(chars[left])) {
                left++;
            }
            while (0 <= right && !set.contains(chars[right])) {
                right--;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = tmp;
            }
        }
        return new String(chars);
    }
}
