package ch08;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째숫자 입력 : ");
        int fir = sc.nextInt();
        System.out.println("두번째숫자 입력 : ");
        int sec = sc.nextInt();
        CalculatorTest ca = new CalculatorTest();
        ca.calculator(fir, sec);
    }

    void calculator(int firstNum, int secondNum) {
        int add = firstNum + secondNum;
        int gob = firstNum * secondNum;
        int sub = Math.abs(firstNum - secondNum);
        System.out.println("더한값 = " + add + " 곱한값 = " + gob + " 뺀값 = " + sub);
    }
}
