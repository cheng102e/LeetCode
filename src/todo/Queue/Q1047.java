package todo.Queue;

public class Q1047 {
    public String removeDuplicates(String s) {
        char[] chs = s.toCharArray();
        StringBuilder stack = new StringBuilder();
        int index = -1;
        for (Character c : chs) {
            if (stack.length() == 0) {
                stack.append(c);
                index++;
            } else {
                if (stack.charAt(index) == c) {
                    stack.deleteCharAt(index);
                    index--;
                } else {
                    stack.append(c);
                    index++;
                }
            }
        }
        return stack.toString();
    }
}
