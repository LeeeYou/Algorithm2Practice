package com.algorithm2practice.sorting.basic.comparator_speed;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/1/29.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] A = com.algorithm2practice.sorting.basic.comparator_speed.A.getData();

        long cur = System.currentTimeMillis();
        insertionSort(A, A.length);
        System.out.println("耗时：" + (System.currentTimeMillis() - cur));//耗时：4690

        System.out.printf(Arrays.toString(A));
    }

    private static int[] insertionSort(int[] A, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (A[j] > A[i]) {
                    A[i] = A[i] ^ A[j];
                    A[j] = A[i] ^ A[j];
                    A[i] = A[i] ^ A[j];
                }
            }
        }

        return A;
    }
}
