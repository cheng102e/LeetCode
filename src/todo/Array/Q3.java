package todo.Array;

import java.util.HashSet;

public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 1;
        int left = 0;
        int len = 1;
        set.add(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (!set.contains(ch[i])) {
                len++;
                max = Math.max(max, len);
            } else {
                while (set.contains(ch[i])) {
                    set.remove(ch[left++]);
                }
                len = set.size() + 1;
            }
            set.add(ch[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
}
