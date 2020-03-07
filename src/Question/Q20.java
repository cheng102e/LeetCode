package Question;

import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 22:08
 */
public class Q20 {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (c == ')' && !stack.isEmpty()) {
        if (stack.peek() == '(') {
          stack.pop();
        } else {
          return false;
        }
      } else if (c == ']' && !stack.isEmpty()) {
        if (stack.peek() == '[') {
          stack.pop();
        } else {
          return false;
        }
      } else if (c == '}' && !stack.isEmpty()) {
        if (stack.peek() == '{') {
          stack.pop();
        } else {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
