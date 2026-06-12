package ch08;

public class WhileTest3 {
    static void main(String[] args) {
//       월급 1원에서 매월2배씩 1억만들기 몇개월
        int sal = 1;
        int mth = 1;
        while (sal < 100000000) {
            System.out.println(sal + " : " + mth);
            mth++;
            sal *= 2;

        }
        System.out.println(mth - 1);


    }
}
