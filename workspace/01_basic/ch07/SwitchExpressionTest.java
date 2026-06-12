package ch07;

public class SwitchExpressionTest {
    public static void main(String[] args) {
        String dota = "ADMIN";
        switch (dota) {
            case "ADMIN":
                System.out.println("관리자 권한");
                break;
            case "USER":
                System.out.println("일반 사용자 권한");
                break;
            default:
                System.out.println("권한 없음");
                break;
        }
    }
}
