package ch07;


import java.util.Scanner;

//나이에 따른 입장료 할인율 계산 프로그램
//7세 이하 : 영유아 100% 할인
//8세 ~ 13세 : 어린이 50% 할인
//14세 ~ 19세 : 청소년 30% 할인
//65세 이상 : 어른 70% 할인
public class IfSwitchTest {
    public static void main(String[] args) {
        IfSwitchTest discount = new IfSwitchTest();
        Scanner sc = new Scanner(System.in);
        discount.discountIf(sc.nextInt(14));
//        discount.discountIf(1000);
//        discount.discountSwitch(20);
//        discount.discountSwitch(70);
//        discount.discountSwitch(71);
    }

    void discountIf(int age) {
        int price = 20000;
        double discountRate = 0.0;
        int lastPrice;

        if (age <= 7) {
            discountRate = 1.0;
        } else if (age >= 8 && age <= 13) {
            discountRate = 0.5;
        } else if (age >= 14 && age <= 19) {
            discountRate = 0.3;
        } else if (age >= 65) {
            discountRate = 0.7;
        } else {
            discountRate = 0.0;
        }
//        lastPrice = (int) (price * (1 - discountRate / 100));
        lastPrice = (int) (price * (1 - discountRate));
        discountRate *= 100;
        System.out.println("나이가 " + age + "세 이므로 할인율 " + (int) discountRate + "%가 적용되어 요금은 " + lastPrice + "원 입니다");
    }

    void discountSwitch(int person) {
        int price = 20000;
        double discountRate = 0.0;
        int lastPrice;

        switch (person) {
            case 1, 2, 3, 4, 5, 6, 7:
                discountRate = 100;
                break;
            case 8, 9, 10, 11, 12, 13:
                discountRate = 50;
                break;
            case 14, 15, 16, 17, 18, 19:
                discountRate = 30;
                break;
            case 65, 66, 67, 68, 69, 70:
                discountRate = 70;
                break;
            default:
                discountRate = 0;
                break;
        }
        lastPrice = (int) (price * (1 - discountRate / 100));
        System.out.println("나이가 " + person + "세 이므로 할인율 " + (int) discountRate + "%가 적용되어 요금은 " + lastPrice + "원 입니다");
    }
}
