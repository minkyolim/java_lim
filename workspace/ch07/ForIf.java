package ch07;

public class ForIf {
    public static void main(String[] args) {
//        50만원에서 하루 수익 3%씩 복리로 1000만원을 만드는데 걸리는 일수
//        근데이제 7일마다 수익 6%씩을 곁들인
        ForIf fi = new ForIf();
        fi.compoundInterestCalculator(10000000, 100000, 5, 10);

    }

    void compoundInterestCalculator(int targetAmount, double initialCapital, double profitPercentage, double luckyDayPercentage) {
//        int targetAmount = 10000000;
//        int initialCapital = 500000;
//        double profitPercentage = 0.03;
//        double luckyDayPercentage = 0.06;
        int days = 1;
        for (; initialCapital < targetAmount; days++) {
            if (days % 7 == 0) {
                initialCapital = initialCapital * (1 + luckyDayPercentage / 100);
            } else {
                initialCapital = initialCapital * (1 + profitPercentage / 100);
            }
            System.out.println(days + "일째 : " + Math.round(initialCapital) + "원");
        }
        System.out.println((days - 1) + "일 뒤에 " + Math.round(initialCapital) + "원 달성!");
    }
}
