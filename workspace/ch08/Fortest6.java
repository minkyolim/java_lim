package ch08;

public class Fortest6 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int res = i * j;
                System.out.print(i + " X " + j + " = " + res + "\t");
            }
            System.out.println();
        }
    }
}
