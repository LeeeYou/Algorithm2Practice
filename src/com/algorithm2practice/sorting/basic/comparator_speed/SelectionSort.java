package com.algorithm2practice.sorting.basic.comparator_speed;

/**
 * Created by liuzhif on 16/1/28.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] A = com.algorithm2practice.sorting.basic.comparator_speed.A.getData();

        long cur = System.currentTimeMillis();
        selectionSort(A, A.length);
        System.out.println("耗时：" + (System.currentTimeMillis() - cur));//耗时：1961
    }

    private static int[] selectionSort(int[] A, int length) {
        int max = 0, maxIndex = 0;
        for (int i = 0; i < length; i++) {
            max = A[0];
            maxIndex = 0;
            for (int j = 0; j < length - i; j++) {
                if (A[j] > max) {
                    max = A[j];
                    maxIndex = j;
                }
            }

            A[maxIndex] = A[length - i - 1];
            A[length - i - 1] = max;
        }

        return A;
    }
}
