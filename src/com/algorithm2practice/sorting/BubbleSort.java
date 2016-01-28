package com.algorithm2practice.sorting;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/1/28.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

        System.out.printf(Arrays.toString(bubbleSort(A, A.length)));
    }

    private static int[] bubbleSort(int[] A, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    A[j] = A[j] ^ A[j + 1];
                    A[j + 1] = A[j] ^ A[j + 1];
                    A[j] = A[j] ^ A[j + 1];
                }
            }
        }

        return A;
    }

}
