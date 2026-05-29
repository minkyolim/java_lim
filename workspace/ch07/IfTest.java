package ch07;

import java.util.Scanner;

public class IfTest {
    static void main() {
//        입력한 숫자가 3의배수일때 "3의배수입니다" 출력
//        그렇지 않으면 아무것도 하지않는다
        IfTest bigNumber = new IfTest();
        bigNumber.biggestNumberCarculator(10,20,30);

    }

    void biggestNumberCarculator(int num1, int num2, int num3) {
//        2,3,5,7
        int bigNum = 0;
        if (num1 > num2 && num1 > num3) {
            bigNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            bigNum = num2;
        } else if (num3 > num1 && num3 > num2) {
            bigNum = num3;
        }
        System.out.println("가장큰수는 " + bigNum + " 입니다");
    }
}
