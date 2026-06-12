package ch09;

import java.util.Arrays;

public class ArrayTestReal {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 56, 0, 34, 4};
        int[] arr2 = {3, 2, 1};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        // 1번 문제 arr의 모든 요소 출력
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
// 2번 문제 arr2와 arr3의 모든 요소가 같은 값을 가지고 있는지 출력

//        비정렬버전
        boolean isEquels = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != arr3[i]) {
                isEquels = false;
                break;
            }
        }
        System.out.println("arr2: " + Arrays.toString(arr2) + "arr3: " + Arrays.toString(arr3) + ((isEquels) ? "같다" : "다르다"));

//        정렬버전
        int[] sorted2 = arr2.clone();
        int[] sorted3 = arr3.clone();
        Arrays.sort(sorted2);
        Arrays.sort(sorted3);
        boolean isEquel = true;
        for (int i = 0; i < arr2.length; i++) {
            if (sorted2[i] != sorted3[i]) {
                isEquel = false;
            }
        }
        System.out.println("arr2: " + Arrays.toString(arr2) + "arr3: " + Arrays.toString(arr3) + ((isEquel) ? "같다" : "다르다"));
// 3번 arr 요소의 최소값과 최댓값을 구하시오
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + "에서 최댓값은: " + max + " 최솟값은: " + min);
// 4번 문제 arr의 요소를 오름차순으로 정렬.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
