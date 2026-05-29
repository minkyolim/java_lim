package ch08;

public class ForTest2 {
    public static void main(String[] args) {
//        월급 1,000,000원 1억1원모으는데 걸리는 개월수
//        int money = 2000000;
//        int total = 0;
//        int month = 0;
//
//        for (; total <= 100000001; month++) {
//            total = total + money;
//        }
//        System.out.println(month + "개월 걸렸습니다");
//        ===================================================================
//        월급 1원 매월 2배씩 올라갈때 1억 모으는데 걸리는 개월수
//        int mth = 0;
//        int sum = 0;
//        for (int sal = 1; sum <= 100000000; mth++) {
//            sum += sal;
//            sal *= 2;
//        }
//        System.out.println("총 " + mth + "개월 걸려서 " + sum + "원 모았습니다");
//        int ran = (int) (Math.random() * 10 + 1);
//        int ran2 = (int) (Math.random() * 10 + 1);
//        int min = Math.min(ran, ran2);
//        int max = Math.max(ran, ran2);
//        int sum = 0;
//        for (int m = min; m <= max; m++) {
//            sum += m;
//        }
//        System.out.println(min + "와/과 " + max + "사이 값들의 합은 " + sum + "입니다");
//        월???만원씩 1년마다 월급 ??만원씩 올라서 최대 ???만원으로 ?억을 모으는데 걸리는 개월수는
        ForTest2 ft2 = new ForTest2();
        ft2.salaryCaculator(3000000, 500000, 300000000);

    }

    void salaryCaculator(int sal, int add, int mn) {
        int s = sal;
        int mth = 0;
        int total = 0;
        for (; total <= mn; mth++) {
            total += s;
            if (mth+1 >= 12 && (mth+1) % 12 == 0) {
                if (s == 5000000);
                else s = s + add;
            }
        }
        System.out.println(total + "만드는데걸린개월수 = " + (mth - 1));
    }
}

