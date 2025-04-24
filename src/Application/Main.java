package Application;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            for (int i = 0; i < a; i++) {
                int b = in.nextInt();
                int c = in.nextInt();
                for (int j = 0; j < c; j++) {
                    if(b > 3){
                        b = (int) Math.ceil( Math.sqrt(b));
                    }else {
                        b--;
                    }

                }
                System.out.println(b);
            }
        }
    }


}
