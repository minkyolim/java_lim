package ch08;

public class WhileTest {
    public static void main(String[] args) {
//        첫달 1원 매달2배씩 몇달지나야 1억
        int money = 1;
        int month =1;
        int total =0;
        while (total<100000000){
            total+=money;
            money = money*2;
            month++;
        }
        System.out.println(month);
    }
}
