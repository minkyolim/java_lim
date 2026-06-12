package ch07;

public class IfTest2 {
    // Object 생략가능
    public static void main(String[] args) {
        int a = 10;
        String s = String.valueOf(a);
        int month = 2;
//        if ((month % 2 == 0) && (month != 2) && (month >= 1) && (month <= 12) && (month != 12)) {
//            System.out.println(month + "월달의 마지막날은 30일입니다");
//        } else if (month == 2) {
//            System.out.println(month + "월달의 마지막날은 28일입니다");
//        } else if ((month % 2 == 1) && (month >= 1) && (month <= 12) || (month == 12)) {
//            System.out.println(month + "월달의 마지막날은 31일입니다");
//        } else{
//            System.out.println("1에서 12숫자 사이에서만 가능합니다");
//            System.exit(0);
//        }

        if ((month < 1 || month > 12)) {
            System.out.println("1에서 12숫자 사이에서만 가능합니다");
            System.exit(0);
        } else if (month == 2) {
            System.out.println(month + "월달의 마지막날은 28일입니다");
        } else if ((month % 2 == 1) || (month == 12)) {
            System.out.println(month + "월달의 마지막날은 31일입니다");
        } else if (month % 2 == 0) {
            System.out.println(month + "월달의 마지막날은 30일입니다");

        }
    }
}
