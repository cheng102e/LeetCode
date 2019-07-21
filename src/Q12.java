public class Q12 {

  public static String intToRoman(int num) {
    StringBuilder str = new StringBuilder();
    while (num >= 1000) {
      str.append("M");
      num = num - 1000;
    }
    if (num >= 900) {
      str.append("CM");
      num = num - 900;
    }
    if (num >= 500) {
      str.append("D");
      num = num - 500;
    }
    if (num >= 400 && num < 500) {
      str.append("CD");
      num = num - 400;
    }
    while (num >= 100) {
      str.append("C");
      num = num - 100;
    }

    if (num >= 90) {
      str.append("XC");
      num = num - 90;
    }
    if (num >= 50) {
      str.append("L");
      num = num - 50;
    }
    if (num >= 40 && num < 50) {
      str.append("XL");
      num = num - 40;
    }
    while (num >= 10) {
      str.append("X");
      num = num - 10;
    }

    if (num >= 9) {
      str.append("IX");
      num = num - 9;
    }
    if (num >= 5) {
      str.append("V");
      num = num - 5;
    }
    if (num >= 4 && num < 5) {
      str.append("IV");
      num = num - 4;
    }
    while (num >= 1) {
      str.append("I");
      num = num - 1;
    }
    return str.toString();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
