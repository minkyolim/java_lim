package ch09;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
//        int[] a = {5, 2, 6, 8, 9};
//        int[] b = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//
//        b[0] = 90;
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        int[] arr = {100, 0, 37, 98, 53};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + "에서 최솟값은: " + min + " 최댓값은: " + max);

    }
}
