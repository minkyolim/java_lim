package ch08;

public class ForSolve {
    static void main(String[] args) {
//        1~100 합

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터100까지의 합 : " + sum);

//       1~100 홀수,짝수 합

        int oddNumSum = 0;
        int evenNumSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                oddNumSum += i;
            } else {
                evenNumSum += i;
            }
        }
        System.out.println("1부터 100까지의 홀수의 합 : " + oddNumSum + "\n" + "1부터 100까지 짝수의 합 : " + evenNumSum);

    }
}
