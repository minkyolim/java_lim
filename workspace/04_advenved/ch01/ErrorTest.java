package ch01;

public class ErrorTest {
    public static void main(String[] args) {
        try {//플랜A
            int result = 10 / 0;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {//플랜B
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 종료");

        try {
            makeError();
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("에러발생: "+t.getClass().getSimpleName());
        }

    }

    static void makeError() {
        makeError();
    }
}

