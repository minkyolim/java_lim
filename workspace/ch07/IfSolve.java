package ch07;

public class IfSolve {
    public static void main(String[] args) {
        int score = -11;
        char grade = 0;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score >= 0) {
                grade = 'F';
            }
            System.out.println(grade);
        } else {
            System.out.println("올바르지 않은 점수입니다.");
        }

    }
}