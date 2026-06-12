package ch06;

public class OperatorSolve {
    static void main() {
//        실습1
        System.out.println("=== [실습 1] 정수와 실수의 산술 연산 ===");

//        문제1-1
        int a = 10;
        int b = 3;
        double divResult =(double)a/b;
        System.out.println("10 / 3 결과 (실수) : " +divResult);

//        문제1-2
        int modResult = a%b;
        System.out.println("10을 3으로 나눈 나머지 : " + modResult);

//        실습2
        System.out.println("\n=== [실습 2] 삼항 연산자와 비교 연산자 ===");

//        문제2
        int number = 15;
        String evenOrOdd = (number % 2 != 0)?"홀수":"짝수";
        System.out.println(number + "은/는 " + evenOrOdd + " 입니다.");

//        실습3
        System.out.println("\n=== [실습 3] 논리 연산자를 활용한 윤년 판별 ===");

//        문제3
        int year = 2024;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        System.out.println(year + "년은 윤년인가요? " + isLeapYear);
    }
}
