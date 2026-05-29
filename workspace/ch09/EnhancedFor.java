package ch09;

public class EnhancedFor {
    public static void main(String[] args) {
//        int[] scores = {90,80,70};
        int[] scores = {100, 80, 70, 88};

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = sum / scores.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
