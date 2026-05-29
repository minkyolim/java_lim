package ch08;

import java.util.Random;

public class WhileTest2 {
    public static void main(String[] args) {
//        int num = 0;
//        while (num != 6){
//            num = (int)(Math.random()*6)+1;
//            System.out.println(num);
//        }
//        Random ran = new Random();
//        System.out.println(ran.nextInt(5));
//
//        int num;
//        num = (int)(Math.random()*10);
//        System.out.println(num);
        int num = 0;
        int count =0;
        while (num != 600) {
            count++;
            num = (int) (Math.random() * 600 + 1);
            System.out.println(num);
        }
        System.out.println("총"+count+"번실행");
    }
}
