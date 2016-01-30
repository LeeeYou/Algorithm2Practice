package com.algorithm2practice.sorting;

import java.util.Arrays;

/**

 * Created by leeyou on 2016/1/29.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

        System.out.printf(Arrays.toString(insertionSort(A, A.length)));
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
