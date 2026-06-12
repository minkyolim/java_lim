package ch09;

import java.lang.annotation.Target;

public class ArrayMemory {
    public static void main(String[] args) {
        int age = 25;
        int[] scores = new int[3];

        scores[0] = 90;

        System.out.println(age);
        System.out.println(scores);
        System.out.println(scores[0]);
    }
}
