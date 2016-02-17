package com.algorithm2practice.sorting.basic.comparator_speed;

import java.util.Arrays;

/**
 * Created by leeyou on 2016/1/28.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = A.getData();

        long cur = System.currentTimeMillis();
        bubbleSort(data, data.length);
        System.out.println("耗时：" + (System.currentTimeMillis() - cur));//耗时：4982

        System.out.printf(Arrays.toString(data));
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
