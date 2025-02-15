package todo.Back;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17 {

    List<String> result = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    Map<Character, String> phoneMap;
    char[] letters;

    public List<String> letterCombinations(String digits) {

        phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        letters = digits.toCharArray();
        back(0, letters.length);
        return result;
    }

    public void back(int index, int length) {
        if (index == length) {
            if (path.length() > 0) {
                result.add(path.toString());
            }
            return;
        }
        char c = letters[index];
        String s = phoneMap.get(c);
        for (int i = 0; i < s.length(); i++) {
            path.append(s.charAt(i));
            back(index + 1, length);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
