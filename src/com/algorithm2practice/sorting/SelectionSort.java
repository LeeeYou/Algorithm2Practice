package com.algorithm2practice.sorting;

import java.util.Arrays;

/**
 * Created by liuzhif on 16/1/28.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] A = new int[]{90, -1, 3, 45, 22, 33, 33, 2, 19, 67, 82, 49, 50, 25, 56};

        System.out.printf(Arrays.toString(selectionSort(A, A.length)));
    }

    private static int[] selectionSort(int[] A, int length) {
        int max = 0, maxIndex = 0;
        for (int i = 0; i < length; i++) {
            max = A[0];//总是默认第0个元素为最大值
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
