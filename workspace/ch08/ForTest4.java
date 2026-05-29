package ch08;

public class ForTest4 {
    public static void main(String[] args) {
        ForTest4 st1 = new ForTest4();
        ForTest4 st2 = new ForTest4();
        ForTest4 st3 = new ForTest4();
        ForTest4 st4 = new ForTest4();

        st1.star1();
//        st2.star2();
//        st3.star3();
        st4.star4();
//        for (int i = 0; i < 3; i++) {
//            if (i == 0) {
//                System.out.println("i = " + i);
//                System.out.println("0");
//            }
//            System.out.println(i);
//            int sum = 0;
//            sum += i;
//            System.out.println("sum" + sum);
//            for (int j = 0; j < i; j++) {
//                System.out.println(i);
//                for (int k = 0; k < j; k++) {
//                    System.out.println(i);
//                }
//            }
//        }


//        for (int i = 5; i > 0; i--) {
//            System.out.println(i+"fir");
//            for (int j = 0; i > j; j++) {
//                System.out.println(i+"sec");
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i+"fir");
//            for (int j = 0; i > j; j++) {
//                System.out.println(i+"sec");
//            }
//        }

    }

    //    *
//    **
//    ***
//    ****
//    *****
    void star1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "fir");
            for (int j = 0; j < i; j++) {
                System.out.println(i + "sec");

            }
            System.out.println();
        }
    }

    //    *****
//    ****
//    ***
//    **
//    *
    void star2() {
        for (int i = 0, max = 5, max2 = max; i < max; i++, max2--) {
            for (int j = 0; j < max2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void star3() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i + "fir");
            for (int j = 0; j < i; j++) {
                System.out.println(i + "sec");

            }
            System.out.println();
        }

    }

    void star4() {

    }
}
