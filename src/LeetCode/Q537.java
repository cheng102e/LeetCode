package LeetCode;

public class Q537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] n1 = num1.split("\\+|i");
        String[] n2 = num2.split("\\+|i");
        int a = Integer.parseInt(n1[0]);
        int b = Integer.parseInt(n1[1]);
        int c = Integer.parseInt(n2[0]);
        int d = Integer.parseInt(n2[1]);
        String ans = (a * c - b * d) + "+" + (b * c + a * d) + "i";
        return ans;
    }
}
