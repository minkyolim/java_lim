package ch09;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] shallow = original;

        for (int i = 0; i < original.length; i++) {
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        shallow[0] = 99;

        for (int i = 0; i < original.length; i++) {
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        System.out.println();
    }
}
