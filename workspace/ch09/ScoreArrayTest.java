package ch09;

public class ScoreArrayTest {
    public static void main(String[] args) {
//         haruScore;
//        haruScore = new int[3];
//        haruScore[0] = 100;
//        haruScore[1] = 90;
//        haruScore[2] = 85;

//        haruScore = new int[]{100,90,85};
        int[] haruScore = {100,90,85};
        System.out.println(haruScore[0]);
        System.out.println(haruScore[1]);
        System.out.println(haruScore[2]);


        int sum = haruScore[0] + haruScore[1] + haruScore[2];
//        소수1째자리 반올림
        double avg = Math.round(sum / 3.0);
//        소수2째자리 반올림
        double avg2 = sum / 3.0;
        avg2 = Math.round(avg2 * 100) / 100.0;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("평균 : " + avg2);
    }
}
