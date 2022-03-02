package LeetCode;

public class Q2000 {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int index = -1;
        char[] chars = word.toCharArray();
        for(int i = 0;i<n;i++){
            if(chars[i] == ch){
                index = i;
                break;
            }
        }
        if(index == -1){
            return word;
        }else {
            int l = 0,r = index;
            while (l<r){
                char tmp = chars[l];
                chars[l++] = chars[r];
                chars[r--] = tmp;
            }
            word = new String(chars);
            return word;
        }

    }
}
