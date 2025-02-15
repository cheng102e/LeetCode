package LeetCode.Q2000;

import java.util.HashSet;
import java.util.Set;

public class Q1763 {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((j - i + 1 > ans.length()) && check(s.substring(i, j + 1))) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    boolean check(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> setlower = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
            char a = Character.toLowerCase(c);
            setlower.add(a);
        }

        if (set.size() == setlower.size() * 2) {
            return true;
        }
        return false;
    }
}
