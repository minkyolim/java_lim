package ch11.capsule.ex01;

public class ScoreTest {
    public static void main(String[] args) {
        Score haru = new Score();
//        haru.kor = 100;
//        haru.eng = 90;
//        haru.math = 85;
//        int haruSum = haru.sum(100, 90, 85);
//        double haruAvg = haru.avg();

        haru.scoreScanner();
        haru.printScore();
    }
}
