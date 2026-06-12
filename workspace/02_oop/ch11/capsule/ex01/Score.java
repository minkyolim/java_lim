package ch11.capsule.ex01;


import java.util.Scanner;

public class Score {
    private int kor;
    private int eng;
    private int math;

    Scanner sc = new Scanner(System.in);

    private int sum() {
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
        int total = kor + eng + math;
        return total;
    }

    private double avg() {
        double total = Math.round(sum() / 3.0 * 10) / 10.0;
        return total;
    }

    void printScore() {
        System.out.println("하루의 총점: " + sum());
        System.out.println("하루의 평균: " + avg());
    }

    void scoreScanner() {
        System.out.print("국어점수를 입력해주세요: ");
        this.kor = sc.nextInt();
        for (int i = 0; this.kor > 100 || this.kor < 0; i++) {
            switch (i) {
                case 2:
                    System.out.println("눈좀 크게 뜨세요");
                    break;
                case 4:
                    System.out.println("제발 눈좀 크게 뜨세요!!");
                    break;
                case 6: {
                    kor = eng = math = 0;
                    System.out.println("Take care of your eyes");
                    return;
                }
            }
            System.out.println("잘못된입력 다시입력해주세요");
            System.out.print("국어점수를 입력해주세요: ");
            this.kor = sc.nextInt();

        }
        System.out.print("영어점수를 입력해주세요: ");
        this.eng = sc.nextInt();
        while (this.eng > 100 || this.eng < 0) {
            System.out.println("잘못된입력 다시입력해주세요");
            System.out.print("영어점수를 입력해주세요: ");
            this.eng = sc.nextInt();
        }
        System.out.print("수학점수를 입력해주세요: ");
        this.math = sc.nextInt();
        while (this.math > 100 || this.math < 0) {
            System.out.println("잘못된입력 다시입력해주세요");
            System.out.print("수학점수를 입력해주세요: ");
            this.math = sc.nextInt();
        }
    }

}
