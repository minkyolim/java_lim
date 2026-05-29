package ch07;

public class SwitchTest {
    public static void main(String[] args) {
//        int diceNum = 6;
//        switch (diceNum) {
//            case 1:
//                System.out.println("주사위눈 1이 나왔습니다");
//                break;
//            case 2:
//                System.out.println("주사위눈 2이 나왔습니다");
//                break;
//            case 3:
//                System.out.println("주사위눈 3이 나왔습니다");
//                break;
//            case 4:
//                System.out.println("주사위눈 4이 나왔습니다");
//                break;
//            case 5:
//                System.out.println("주사위눈 5이 나왔습니다");
//                break;
//            case 6:
//                System.out.println("주사위눈 6이 나왔습니다");
//                break;
//            default:
//                System.out.println("오류");
//                break;
//        }
//        act(2);

//        회원등급에 따른 할인 혜택적용 예제
//        골드 등급 50% 할인 A
//        실버 등급 30% 할인 B
//        브론즈 등급 10% 할인 C
//        일반 등급 0% 할인 D


        char grade = 'D';

        SwitchTest dc = new SwitchTest();
        dc.discount('A');

//        System.out.println("회원님은" + grade + "등급 이므로 정상가 " + price + "원에서 " + discountRate + "%할인된 가격 " + lastPrice + "원입니다");
    }

    void discount(char gd) {
        char grade = gd;
        int price = 10000;
        int discountRate = 0;
        int lastPrice ;
        switch (grade) {
            case 'A':
                discountRate = 50;
                break;
            case 'B':
                discountRate = 30;
                break;
            case 'C':
                discountRate = 10;
                break;
            case 'D':
                discountRate = 0;
                break;
        }
        lastPrice = price * (1-discountRate/100);

    }

//    static void act(int Num) {
//        int diceNum = Num;
//        switch (diceNum) {
//            case 1:
//                System.out.println("주사위눈 1이 나왔습니다");
//                break;
//            case 2:
//                System.out.println("주사위눈 2이 나왔습니다");
//                break;
//            case 3:
//                System.out.println("주사위눈 3이 나왔습니다");
//                break;
//            case 4:
//                System.out.println("주사위눈 4이 나왔습니다");
//                break;
//            case 5:
//                System.out.println("주사위눈 5이 나왔습니다");
//                break;
//            case 6:
//                System.out.println("주사위눈 6이 나왔습니다");
//                break;
//            default:
//                System.out.println("오류");
//                break;
//        }
//    }

}
