package todo.Hash;

import java.util.HashMap;
import java.util.Map;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<>();
        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            table.put(c, table.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<s.length();i++) {
            char c = t.charAt(i);

            table.put(c, table.getOrDefault(c,0)-1);
            if(table.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
