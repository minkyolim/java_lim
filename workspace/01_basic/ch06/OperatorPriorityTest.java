package ch06;

public class OperatorPriorityTest {
    int a = 10;
    static int b = 20;


    static void main(String[] args) {
        boolean isPrice;

        OperatorPriorityTest opt = new OperatorPriorityTest();
        System.out.println(opt.a);

        System.out.println(b);
    }
    static String home(){
        String s = "good";
        return s;
    }

    String ab = OperatorPriorityTest.home();

    int trade(int price, int give) {
        return 0;
    }

}

class What {
    static void main() {
        System.out.println(OperatorPriorityTest.b);
    }
//    OperatorPriorityTest opt = new OperatorPriorityTest();
//    int a = opt.a;
    int a = OperatorPriorityTest.b;
//    String ab = OperatorPriorityTest.home();
}