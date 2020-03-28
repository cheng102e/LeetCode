package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-16 20:45
 */
public class M0106 {

  public String compressString(String S) {
    if (S == null || S.length() == 0) {
      return S;
    }
    StringBuffer str = new StringBuffer(S);
    StringBuffer ans = new StringBuffer();
    int num = 1;
    char c = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        num++;
      } else {
        ans.append(c);
        ans.append(num);
        num = 1;
        c = str.charAt(i);
      }
    }
    ans.append(c);
    ans.append(num);
    if (ans.length() >= str.length()) {
      return S;
    } else {
      return ans.toString();
    }
  }
}
