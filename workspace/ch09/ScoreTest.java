package ch09;

public class ScoreTest {
    public static void main(String[] args) {
        int kor = 100;
        int eng = 90;
        int math = 85;

        int sum = kor + eng + math;
//        소수1째자리 반올림
        double avg = Math.round(sum / 3.0);
//        소수2째자리 반올림
        double avg2 = sum / 3.0;
        avg2 = Math.round(avg2 * 100) / 100.0;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("평균 : " + avg2) ;
    }
}
