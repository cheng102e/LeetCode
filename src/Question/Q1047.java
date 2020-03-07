package Question;

import java.util.Stack;

public class Q1047 {

  public static String removeDuplicates(String S) {
    char[] ch = S.toCharArray();
    Stack stack = new Stack();
    int i = 0;
    while (i < ch.length) {
      if (stack.empty()) {
        stack.push(ch[i]);
      } else if (stack.peek().equals(ch[i])) {
        stack.pop();
      } else {
        stack.push(ch[i]);
      }
      i++;
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.empty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
