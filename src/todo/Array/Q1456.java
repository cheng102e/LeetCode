package todo.Array;

public class Q1456 {
    public int maxVowels(String s, int k) {

        int count = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < k; i++) {
            count += is(chs[i]);
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {
            count += is(chs[i]);
            count -= is(chs[i - k]);
            max = Math.max(max, count);
        }
        return max;
    }

    public int is(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }
}
