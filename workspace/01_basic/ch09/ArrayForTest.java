package ch09;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForTest {
    public static void main(String[] args) {
//        구구단앞자리를 입력받고 곱해질 수를 입력받아 결과값을 출력하는 프로그램
//        1.단입력받기
        System.out.println("숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println(firstNum + "단을 입력받았습니다!");

//        2.곱해지는 값의 최대범위 입력받고, 계산값 배열에 푸쉬
        System.out.print("곱할 값의 최대값을 입력해주세요 : ");
        int max = sc.nextInt();
        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = firstNum * (i + 1);
        }
//        System.out.println(ArraysTest.toString(result));

//        3.계산출력
        for (; true; ) {
            System.out.print("곱할 값을 입력해주세요 : ");
            int secondNum = sc.nextInt();
            if (secondNum == 0) {
                System.out.println("0을 입력받아 프로그램을 종료합니다");
                break;
            } else if (secondNum > max) {
                System.out.println("최대 " + max + " 까지만 입력 가능합니다/ 0입력 프로그램종료");
            } else
                System.out.println(firstNum + " X " + secondNum + " = " + result[secondNum - 1]);
        }
    }
}
