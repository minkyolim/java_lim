package ch10;

public class VarargsTest {
    public static void main(String[] args) {
        VarargsTest vt = new VarargsTest();
        vt.sum(10, 20);
        vt.sum(10, 20, 30);
        vt.sum(10, 20, 30, 40);
    }

    void sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("2개의합계: " + result);
    }

    void sum(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        System.out.println("3개의합계: " + result);
    }

    void sum(int n1, int n2, int n3, int n4) {
        int result = n1 + n2 + n3 + n4;
        System.out.println("4개의합계: " + result);
    }

    void sum(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
    }
}
