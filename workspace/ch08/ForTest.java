package ch08;

import java.util.Random;

public class ForTest {
    public static void main(String[] args) {
//        Random ran = new Random();
//        Random ran2 = new Random();
        int num = 0;
        int num2 = 0;
        int count = 0;
        int count2 = 0;
        for (count = 1; ; count++) {
            num = (int) (Math.random() * 6 + 1);
//            num = ran.nextInt(6)+1;
            if (num == 6) {
                System.out.println(num + "이나왔습니다");
                break;
            }
        }
        System.out.println("총" + count + "번실행했습니다");
//====================================================================================
        for (; num2 != 6; count2++) {
            num2 = (int) (Math.random() * 6 + 1);
//            num = ran2.nextInt(6)+1;
        }
        System.out.println("숫자 " + num2 + "이/가 " + count2 + "번 만에 나왔습니다");
    }
}
