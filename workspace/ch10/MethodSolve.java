package ch10;

public class MethodSolve {
    public static void main(String[] args) {
        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        MethodSolve cal = new MethodSolve();

        cal.printScore(haruScore);
        cal.printScore(namuScore);
        cal.printScore(brongScore);
        cal.printScore(haruScore, namuScore, brongScore);
    }

    //    과목별점수 총합
    int sum(int[] score) {
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total;
    }

    //과목평균
    double avg(int[] b) {
        double length = b.length;
        double avg = sum(b) / length;
        avg = Math.round(avg * 10) / 10.0;
        return avg;
    }

    //총합,평균 출력
    void printScore(int[] a) {
        System.out.println("총점: " + sum(a) + "평균: " + avg(a));
    }

    //    3명의 과목총합,평균
    void printScore(int[] a, int[] b, int[] c) {
        int sum = sum(a) + sum(b) + sum(c);
        double avg = (avg(a) + avg(b) + avg(c)) / 3.0;
        avg = Math.round(avg * 10) / 10.0;
        System.out.println("3명의 총점의 총합: " + sum + " 3명의 평균의 평균: " + avg);
    }
}
